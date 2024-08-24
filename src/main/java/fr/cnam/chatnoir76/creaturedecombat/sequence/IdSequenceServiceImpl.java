package fr.cnam.chatnoir76.creaturedecombat.sequence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdSequenceServiceImpl implements IdSequenceService {

	@Autowired
    IdSequenceDAO dao;

	@Override
	public int nextCreatureId() {
		return nextIdForTable("carte");
	}
	
	private int nextIdForTable(String tableName) {
        int newId = dao.getCurrentMaxId(tableName) + 1;
        dao.setCurrentMaxId(tableName, newId);
        return newId;
    } 
}
