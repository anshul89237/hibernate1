package com.lpu.oto_Car_Engine;

public interface EngineCRUD {
	void saveEngine(Engine e);
	void updateEngineCC(int id, String cc);
	void deleteEngine(int id);
	void findEngine(int id);
	void findAllEngine();
}
