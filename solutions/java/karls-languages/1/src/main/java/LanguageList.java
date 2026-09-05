import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(languages.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String primeira = languages.getFirst();
        return primeira;
    }
    
    public int count() {
        int size = languages.size();
        return size;
    }

    public boolean containsLanguage(String language) {
        if(languages.contains(language)){
            return true;
        }
        return false;
    }

    public boolean isExciting() {
    String kotlin = "Kotlin";
    String java = "Java";
        if(languages.contains(kotlin)){
            return true;
        }
        else if(languages.contains(java)){
            return true;
        }
        return false;
    }
}
