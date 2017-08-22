package com.simplez.guava.hash;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.hash.PrimitiveSink;

public class HashTest {

	public static void main(String[] args) {
		// Hash
		String inputStr = "";
		System.out.println("input string:" + inputStr);
		
		HashFunction hashFunction = Hashing.md5();
		HashCode hashCode = hashFunction.newHasher().putString(inputStr, Charsets.UTF_8)
				.hash();
		System.out.println("md5:" + hashCode);

		hashFunction = Hashing.sha1();
		hashCode = hashFunction.newHasher().putString(inputStr, Charsets.UTF_8).hash();
		System.out.println("sha1:" + hashCode);

		hashFunction = Hashing.sha256();
		hashCode = hashFunction.newHasher().putString(inputStr, Charsets.UTF_8).hash();
		System.out.println("sha256:" + hashCode);

		hashFunction = Hashing.sha512();
		hashCode = hashFunction.newHasher().putString(inputStr, Charsets.UTF_8).hash();
		System.out.println("sha512:" + hashCode);

		// BloomFilter
		Funnel<Person> personFunnel = new Funnel<Person>() {
			private static final long serialVersionUID = 1L;

			@Override
			public void funnel(Person person, PrimitiveSink into) {
				into.putInt(person.getId())
						.putString(person.getFirstName(), Charsets.UTF_8)
						.putString(person.getLastName(), Charsets.UTF_8)
						.putInt(person.getBirthYear());
			}
		};

		List<Person> friendsList = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			Person person = new Person();
			person.setBirthYear(10);
			person.setId(i);
			person.setFirstName("firstName");
			person.setLastName("lastName");
			friendsList.add(person);
		}

		BloomFilter<Person> friends = BloomFilter.create(personFunnel, 500, 0.01);
		for (Person friend : friendsList) {
			friends.put(friend);
		}

		Person checkPerson = new Person();
		checkPerson.setBirthYear(10);
		checkPerson.setId(1);
		checkPerson.setFirstName("firstName");
		checkPerson.setLastName("lastName");

		// 很久以后
		if (friends.mightContain(checkPerson)) {
			// dude不是朋友还运行到这里的概率为1%
			// 在这儿，我们可以在做进一步精确检查的同时触发一些异步加载
			System.out.println("checkPerson might Contain");
		}

	}
}
