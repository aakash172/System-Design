import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    public static Map<Character,ILetter>characterCached=new HashMap<>();
    public static ILetter getILetter(char characterValue,String fontType,int size){
        if(characterCached.containsKey(characterValue)){
            return characterCached.get(characterValue);
        }else{
            DocumentCharacter obj=new DocumentCharacter(characterValue,fontType,size);
            // We can use implement setter method for fontType and size
            characterCached.put(characterValue,obj);
            return obj;
        }
    }
}
