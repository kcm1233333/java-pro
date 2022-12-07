package com.example.demo;

import java.util.List;

public interface regisINT {

	int regis(String email, String pengguna, String katasandi);
	modelLogin login(String email, String katasandi);
	List<modelLogin> tarikSemua();
    
}
