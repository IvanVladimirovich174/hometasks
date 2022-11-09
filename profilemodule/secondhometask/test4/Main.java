package profilemodule.secondhometask.test4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Document document1 = new Document(1, "Document1", 10);
        Document document2 = new Document(2, "Document2", 20);
        Document document3 = new Document(3, "Document3", 30);

        List<Document> arrayList = List.of(document1, document2, document3);

        Main main = new Main();
        System.out.println(main.organizeDocument(arrayList));
    }

    public Map<Integer, Document> organizeDocument(List<Document> documents) {
        Map<Integer, Document> result = new HashMap<>();

        for (Document document : documents) {
            result.put(document.id, document);
        }

        return result;
    }
}