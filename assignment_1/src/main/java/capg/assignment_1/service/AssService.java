package capg.assignment_1.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import capg.assignment_1.model.Model;

@Service
public class AssService {

	public List<Model> getData(){
		ObjectMapper mapper=new ObjectMapper();
		List<Model> data=null;
		try {
		File f=new File("E:\\JavaScript\\visual-studios-workspace\\data.json");
			data=(List<Model>)mapper.readValue(new FileInputStream(f),new TypeReference<List<Model>>() {});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
