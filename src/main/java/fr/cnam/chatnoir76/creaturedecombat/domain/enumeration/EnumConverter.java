//package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration;
//
//import java.util.stream.Stream;
//
//import jakarta.persistence.AttributeConverter;
//import jakarta.persistence.Converter;
//
//@Converter(autoApply = true)
//public class EnumConverter<E extends Enum> implements AttributeConverter<E, String> {
//	
//	@Override
//	public String convertToDatabaseColumn(PersistEnum attribute) {
//		
//		if (attribute == null) {
//			return null;
//		}
//		return attribute.getCode();
//	}
//
//	@Override
//	public PersistEnum convertToEntityAttribute(String dbData) {
//		
//		if (dbData == null) {
//            return null;
//        }
//
//        return Stream.of(PersistEnum.values())
//          .filter(c -> c.getCode().equals(dbData))
//          .findFirst()
//          .orElseThrow(IllegalArgumentException::new);
//	}
//
//}
