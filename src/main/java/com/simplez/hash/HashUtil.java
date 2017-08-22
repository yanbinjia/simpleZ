package com.simplez.hash;

import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class HashUtil {

	public static String md5(String inputStr) {
		HashFunction hashFunction = Hashing.md5();
		HashCode hashCode = hashFunction.newHasher().putString(inputStr, Charsets.UTF_8)
				.hash();
		return hashCode.toString();
	}

}
