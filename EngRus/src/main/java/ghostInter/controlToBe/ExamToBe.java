package ghostInter.controlToBe;

import java.util.HashMap;
import java.util.Map;

public class ExamToBe
{
    Map<Integer, String> examEn = new HashMap<>();
    Map<Integer, String> examRu = new HashMap<>();

    public Map<Integer, String> getExamEn(){
            getStrEn();
        return examEn;
    }
    public Map<Integer, String> getExamRu(){
        getStrRu();
        return examRu;
    }

    private Map<Integer, String> getStrEn(){

        return examEn;

    }
    private Map<Integer, String> getStrRu(){


        return examRu;

    }
}
