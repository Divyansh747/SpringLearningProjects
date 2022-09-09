package com.example.demo.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.sample.enterprise.flow.data.DataService;


@Component
public class BusinessService {
	@Autowired
	private DataService dataService;

	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();
		return data.stream().reduce(Integer::sum).get();
	}
}

