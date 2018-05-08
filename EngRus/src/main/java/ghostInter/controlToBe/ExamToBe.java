package ghostInter.controlToBe;

import java.util.HashMap;
import java.util.Map;

class ExamToBe
{
    Map<Integer, String> examEn = new HashMap<>();
    Map<Integer, String> examRu = new HashMap<>();

    Map<Integer, String> getExamEn(){
            getStrEn();
        return examEn;
    }
    Map<Integer, String> getExamRu(){
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
