package com.frocent.beans.core;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class ResourceTest {

	@Test
	public void testFileSystemResource() throws IOException{
		
		Resource resource1 = new FileSystemResource("D:/applicationContext.xml");
		Resource resource2 = new ClassPathResource("./applicationContext.xml");

		System.out.println(resource1.exists());
		System.out.println(resource2.exists());

	}
	
	@Test
	public void testResourcePattern() throws IOException{
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resolver.getResources("classpath:*.xml");
		for (Resource resource : resources) {
			System.out.println(resource.getFilename());
		}
	}
	
}
