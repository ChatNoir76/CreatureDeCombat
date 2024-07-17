package fr.cnam.chatnoir76.creaturedecombat.sequence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.entity.CreatureEntity;

@Service
public class IdSequenceServiceImpl implements IdSequenceService {

	@Autowired
    IdSequenceDAO dao;

	@Override
	public int nextCreatureId() {
		return nextIdForTable(CreatureEntity.TABLE_NAME);
	}
	
	private int nextIdForTable(String tableName) {
        int newId = dao.getCurrentMaxId(tableName) + 1;
        dao.setCurrentMaxId(tableName, newId);
        return newId;
    } 
}
