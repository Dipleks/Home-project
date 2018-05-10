package ghostInter.control;

import ghostInter.interfaceRoot.Root;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.Map;

public class AddExercise implements Root
{
    private FillingColumns[] appPS = new FillingColumns[7];
    private FillingColumns[] negPS = new FillingColumns[4];
    private FillingColumns[] quesPS = new FillingColumns[7];
    private FillingColumns[] examPS = new FillingColumns[2];
    private FillingColumns[] appToBe = new FillingColumns[6];
    private FillingColumns[] negToBe = new FillingColumns[4];
    private FillingColumns[] quesToBe = new FillingColumns[7];
    private FillingColumns[] examToBe = new FillingColumns[1];

    private Control controlExercisePS = new Control();
    private Control controlExamPS = new Control();
    private Control controlExerciseToBe = new Control();
    private Control controlExamToBe = new Control();

    public void AddMenuButtonPS(){
        getUprPS();
    }
    public void AddMenuButtonExamPS(){
        getExamPS();
    }
    public void AddMenuButtonToBe(){
        getUprToBe();
    }
    public void AddMenuButtonExamToBe(){
        getExamToBe();
    }

    // PS
    private void getUprPS(){

        appPS[0] = new FillingColumns(new Label[15], new Label[15],0, 15, "PS");
        appPS[1] = new FillingColumns(new Label[15], new Label[15],30, 45, "PS");
        appPS[2] = new FillingColumns(new Label[15], new Label[15], 60, 75, "PS");
        appPS[3] = new FillingColumns(new Label[15], new Label[15],90, 105, "PS");
        appPS[4] = new FillingColumns(new Label[15], new Label[15],120, 135, "PS");
        appPS[5] = new FillingColumns(new Label[15], new Label[15],150, 165, "PS");
        appPS[6] = new FillingColumns(new Label[6], new Label[7],180, 186, "PS");

        negPS[0] = new FillingColumns(new Label[15], new Label[15],193, 208, "PS");
        negPS[1] = new FillingColumns(new Label[15], new Label[15],223, 238, "PS");
        negPS[2] = new FillingColumns(new Label[15], new Label[15],253, 268, "PS");
        negPS[3] = new FillingColumns(new Label[14], new Label[15],283, 297, "PS");

        quesPS[0] = new FillingColumns(new Label[15], new Label[15],312, 327, "PS");
        quesPS[1] = new FillingColumns(new Label[15], new Label[15],342, 357, "PS");
        quesPS[2] = new FillingColumns(new Label[15], new Label[15],372, 387, "PS");
        quesPS[3] = new FillingColumns(new Label[15], new Label[15],402, 417, "PS");
        quesPS[4] = new FillingColumns(new Label[15], new Label[15],432, 447, "PS");
        quesPS[5] = new FillingColumns(new Label[15], new Label[15],462, 477, "PS");
        quesPS[6] = new FillingColumns(new Label[12], new Label[12],492, 504, "PS");

        controlExercisePS.exercise(appPS, negPS, quesPS,
                new Button[7], new Button[4], new Button[7], "AddMenuButtonPS");
    }
    private void getExamPS(){

        examPS[0] = new FillingColumns(new Label[100], new Label[100], new Label[100],  0, "ExamPS");
        examPS[1] = new FillingColumns(new Label[100], new Label[100], new Label[100],  100, "ExamPS");

        controlExamPS.examMethod(examPS,new Button[2], "AddMenuButtonExamPS");
    }
    // ToBe
    private void getUprToBe(){

        appToBe[0] = new FillingColumns(new Label[15], new Label[15],0, 15, "ToBe");
        appToBe[1] = new FillingColumns(new Label[15], new Label[15],30, 45, "ToBe");
        appToBe[2] = new FillingColumns(new Label[15], new Label[15], 60, 75, "ToBe");
        appToBe[3] = new FillingColumns(new Label[15], new Label[15],90, 105, "ToBe");
        appToBe[4] = new FillingColumns(new Label[15], new Label[15],120, 135, "ToBe");
        appToBe[5] = new FillingColumns(new Label[19], new Label[19],150, 169, "ToBe");

        negToBe[0] = new FillingColumns(new Label[15], new Label[15],193, 208, "ToBe");
//        negToBe[1] = new FillingColumns(new Label[15], new Label[15],223, 238);
//        negToBe[2] = new FillingColumns(new Label[15], new Label[15],253, 268);
//        negToBe[3] = new FillingColumns(new Label[14], new Label[15],283, 297);

        quesToBe[0] = new FillingColumns(new Label[15], new Label[15],312, 327, "ToBe");
//        quesToBe[1] = new FillingColumns(new Label[15], new Label[15],342, 357);
//        quesToBe[2] = new FillingColumns(new Label[15], new Label[15],372, 387);
//        quesToBe[3] = new FillingColumns(new Label[15], new Label[15],402, 417);
//        quesToBe[4] = new FillingColumns(new Label[15], new Label[15],432, 447);
//        quesToBe[5] = new FillingColumns(new Label[15], new Label[15],462, 477);
//        quesToBe[6] = new FillingColumns(new Label[12], new Label[12],492, 504);

        controlExerciseToBe.exercise(appToBe, negToBe, quesToBe,
                new Button[6], new Button[1], new Button[1], "AddMenuButtonToBe");
    }
    private void getExamToBe(){

        examToBe[0] = new FillingColumns(new Label[100], new Label[100], new Label[100],  0, "ExamToBe");
//        examToBe[1] = new FillingColumns(new Label[100], new Label[100], new Label[100],  100);

        controlExamToBe.examMethod(examToBe,new Button[1], "AddMenuButtonExamToBe");
    }

    public static class Exam
    {
        private Map<Integer, String> examEnPS = new HashMap<>();
        private Map<Integer, String> examRuPS = new HashMap<>();
        private Map<Integer, String> examEnToBe = new HashMap<>();
        private Map<Integer, String> examRuToBe = new HashMap<>();

        public Map<Integer, String> getExamEnPS(){
                getStrEnPS();
            return examEnPS;
        }
        public Map<Integer, String> getExamRuPS(){
            getStrRuPS();
            return examRuPS;
        }
        public Map<Integer, String> getExamEnToBe(){
            getStrEnToBe();
            return examEnToBe;
        }
        public Map<Integer, String> getExamRuToBe(){
            getStrRuToBe();
            return examRuToBe;
        }

        private Map<Integer, String> getStrEnPS(){

            Runnable runnable = () -> {
                Runnable runnable1 = () -> {
                    examEnPS.put(0,"How often does he test their knowledge?");
                    examEnPS.put(1,"I want to know English better");
                    examEnPS.put(2,"I really like it");
                    examEnPS.put(3,"Do you want to study better?");
                    examEnPS.put(4,"He lives there");
                    examEnPS.put(5,"This test seems very easy");
                    examEnPS.put(6,"I need your advice");
                    examEnPS.put(7,"I need to see her");
                    examEnPS.put(8,"She'd like to go to another place");
                    examEnPS.put(9,"What time do you usually get up?");
                    examEnPS.put(10,"She feels happy");
                    examEnPS.put(11,"Do you often call him?");
                    examEnPS.put(12,"How does he get home?");
                    examEnPS.put(13,"What do you think about it?");
                    examEnPS.put(14,"He doesn't know it");
                    examEnPS.put(15,"What seems useless?");
                    examEnPS.put(16,"Do we have enough practice?");
                    examEnPS.put(17,"I really like these lessons");
                    examEnPS.put(18,"He lives in this country");
                    examEnPS.put(19,"She wants to see you right now");
                    examEnPS.put(20,"I want to be happy");
                    examEnPS.put(21,"She has a car");
                    examEnPS.put(22,"Does he want to live abroad?");
                    examEnPS.put(23,"What do your friends usually order?");
                    examEnPS.put(24,"He works very hard");
                    examEnPS.put(25,"It depend on them");
                    examEnPS.put(26,"What English books does he have?");
                    examEnPS.put(27,"He wants more");
                    examEnPS.put(28,"I understand you very well");
                    examEnPS.put(29,"She explains all these things very well");
                    examEnPS.put(30,"She loves you");
                    examEnPS.put(31,"These lessons really help");
                    examEnPS.put(32,"She does those exercises regularly");
                    examEnPS.put(33,"She always does it on time");
                    examEnPS.put(34,"What helps you?");
                    examEnPS.put(35,"I want to go abroad");
                    examEnPS.put(36,"I need money");
                    examEnPS.put(37,"How often does she go to the cinema?");
                    examEnPS.put(38,"What does she want to add?");
                    examEnPS.put(39,"She works very hard");
                    examEnPS.put(40,"My sister studies there");
                    examEnPS.put(41,"I like your lessons");
                    examEnPS.put(42,"Who love her?");
                    examEnPS.put(43,"I remember it");
                    examEnPS.put(44,"I want a new computer");
                    examEnPS.put(45,"What helps her?");
                    examEnPS.put(46,"She lives this place");
                    examEnPS.put(47,"I'd like a cup of coffee");
                    examEnPS.put(48,"It doesn't seem strange");
                    examEnPS.put(49,"What worries you more?");
                    examEnPS.put(50,"How does it help you?");
                    examEnPS.put(51,"My parents want to do it");
                    examEnPS.put(52,"All people do it");
                    examEnPS.put(53,"How long does it take him to get to that place?");
                    examEnPS.put(54,"He doesn't try to find a good job");
                    examEnPS.put(55,"You don't try to learn English");
                    examEnPS.put(56,"What kind of examples does his teacher give?");
                    examEnPS.put(57,"Does this person seem very good?");
                    examEnPS.put(58,"It doesn't seem useful");
                    examEnPS.put(59,"I think so");
                    examEnPS.put(60,"They go to work");
                    examEnPS.put(61,"How does she explain it?");
                    examEnPS.put(62,"She needs to correct these mistakes");
                    examEnPS.put(63,"What music do you prefer?");
                    examEnPS.put(64,"My sister lives these but I live here");
                    examEnPS.put(65,"How long does it take his daughter to get to school?");
                    examEnPS.put(66,"You need to remember this rule");
                    examEnPS.put(67,"I live in this country");
                    examEnPS.put(68,"Do you remember it?");
                    examEnPS.put(69,"I go to work");
                    examEnPS.put(70,"I need to speak English without any mistakes at all");
                    examEnPS.put(71,"I understand everything");
                    examEnPS.put(72,"It helps me");
                    examEnPS.put(73,"I like it");
                    examEnPS.put(74,"Which drink does she prefer: tea or coffee?");
                    examEnPS.put(75,"Do you support me?");
                    examEnPS.put(76,"Why do your parents disagree with you?");
                    examEnPS.put(77,"She feels so happy");
                    examEnPS.put(78,"He goes to work");
                    examEnPS.put(79,"It depends on us");
                    examEnPS.put(80,"Does he hate this thing?");
                    examEnPS.put(81,"How often do you go there?");
                    examEnPS.put(82,"I like this idea");
                    examEnPS.put(83,"I don't want to study there");
                    examEnPS.put(84,"When do you have free time?");
                    examEnPS.put(85,"She watches different movies");
                    examEnPS.put(86,"Do you often listen to music?");
                    examEnPS.put(87,"I like this method");
                    examEnPS.put(88,"She tries to understand it");
                    examEnPS.put(89,"It doesn't inspire me");
                    examEnPS.put(90,"I want it");
                    examEnPS.put(91,"How often do you think about it?");
                    examEnPS.put(92,"Where do they spend time together?");
                    examEnPS.put(93,"I'd like to drink a cup of coffee");
                    examEnPS.put(94,"When does he feel happy?");
                    examEnPS.put(95,"I don't want to live in that city");
                    examEnPS.put(96,"Who wants to live abroad?");
                    examEnPS.put(97,"She doesn't want to discuss it");
                    examEnPS.put(98,"Your lessons really help");
                    examEnPS.put(99,"He misses you");
                };
                runnable1.run();
                Runnable runnable2 = () -> {
                    examEnPS.put(100,"I do it with great pleasure");
                    examEnPS.put(101,"It attracts me");
                    examEnPS.put(102,"Why does she refuse to pay?");
                    examEnPS.put(103,"This lesson seems interesting");
                    examEnPS.put(104,"How do you get home?");
                    examEnPS.put(105,"He wants more practice");
                    examEnPS.put(106,"Does that test seem very easy?");
                    examEnPS.put(107,"Do we have enough knowledge?");
                    examEnPS.put(108,"How do you spend your free time?");
                    examEnPS.put(109,"Does she remember all these rules?");
                    examEnPS.put(110,"Why does it happen again and again?");
                    examEnPS.put(111,"Do they do business?");
                    examEnPS.put(112,"Does she teach English?");
                    examEnPS.put(113,"She reads in English");
                    examEnPS.put(114,"She speaks English very well");
                    examEnPS.put(115,"Do they support us?");
                    examEnPS.put(116,"These lessons seem very useful");
                    examEnPS.put(117,"He often plays computer games");
                    examEnPS.put(118,"I practice English every day");
                    examEnPS.put(119,"My parents know it");
                    examEnPS.put(120,"Who corrects your mistakes?");
                    examEnPS.put(121,"Does her boyfriend want to go abroad?");
                    examEnPS.put(122,"Why does he say these things again and again?");
                    examEnPS.put(123,"He has a cat");
                    examEnPS.put(124,"Who sees these mistakes?");
                    examEnPS.put(125,"These things attract them");
                    examEnPS.put(126,"I see you really like English");
                    examEnPS.put(127,"I want more practice");
                    examEnPS.put(128,"Does he often think about it?");
                    examEnPS.put(129,"Why do you think so?");
                    examEnPS.put(130,"We speak English");
                    examEnPS.put(131,"Do you go to work?");
                    examEnPS.put(132,"Do you work on your mistakes?");
                    examEnPS.put(133,"Do these things seem unimportant?");
                    examEnPS.put(134,"What does your boss usually answer?");
                    examEnPS.put(135,"I need to study harder");
                    examEnPS.put(136,"Where do you work?");
                    examEnPS.put(137,"How regularly do you practice English?");
                    examEnPS.put(138,"He also works here");
                    examEnPS.put(139,"Does this student show brilliant results?");
                    examEnPS.put(140,"He understand you very well");
                    examEnPS.put(141,"What seems strange?");
                    examEnPS.put(142,"I live in Russia");
                    examEnPS.put(143,"My friend doesn't think so");
                    examEnPS.put(144,"He has an offer");
                    examEnPS.put(145,"Why does he always complain about it?");
                    examEnPS.put(146,"He knows more");
                    examEnPS.put(147,"I see everything");
                    examEnPS.put(148,"He doesn't want to read these books");
                    examEnPS.put(149,"Does he often watch TV?");
                    examEnPS.put(150,"He thinks so");
                    examEnPS.put(151,"I like this thing");
                    examEnPS.put(152,"He teaches English");
                    examEnPS.put(153,"It doesn't help me");
                    examEnPS.put(154,"I don't want to play computer games");
                    examEnPS.put(155,"Do you remember everything?");
                    examEnPS.put(156,"Do you need my advice?");
                    examEnPS.put(157,"My boss reads all the documents");
                    examEnPS.put(158,"She does it very well");
                    examEnPS.put(159,"How much money do you have with you?");
                    examEnPS.put(160,"He sees that mistake");
                    examEnPS.put(161,"Does this lesson seem useful?");
                    examEnPS.put(162,"Who supports you?");
                    examEnPS.put(163,"It seems interestin");
                    examEnPS.put(164,"I don't agree with you / I disagree with you");
                    examEnPS.put(165,"She misses you");
                    examEnPS.put(166,"Do they support this decision?");
                    examEnPS.put(167,"She really remembers it");
                    examEnPS.put(168,"I want to thank you");
                    examEnPS.put(169,"I want to know it");
                    examEnPS.put(170,"We live in this country");
                    examEnPS.put(171,"I really need English");
                    examEnPS.put(172,"How does he support you?");
                    examEnPS.put(173,"I need to correct this mistake");
                    examEnPS.put(174,"He also knows it");
                    examEnPS.put(175,"How regularly does your boss check it?");
                    examEnPS.put(176,"How does your sister feel?");
                    examEnPS.put(177,"How regularly does he do these exercises?");
                    examEnPS.put(178,"I want to go to another place");
                    examEnPS.put(179,"Who do you know?");
                    examEnPS.put(180,"This thing seems unimportant");
                    examEnPS.put(181,"How long does it take her to get to this place?");
                    examEnPS.put(182,"What does he remember?");
                    examEnPS.put(183,"Why do you agree with him?");
                    examEnPS.put(184,"It really happens");
                    examEnPS.put(185,"I'd like a cup of tea");
                    examEnPS.put(186,"I need this thing");
                    examEnPS.put(187,"He often goes to the cinema");
                    examEnPS.put(188,"I want to train my memory");
                    examEnPS.put(189,"They don't do business");
                    examEnPS.put(190,"I don't want to talk/speak about it");
                    examEnPS.put(191,"She doesn't want to think about it");
                    examEnPS.put(192,"She wants to do it right now");
                    examEnPS.put(193,"My friend needs your help");
                    examEnPS.put(194,"Does he ignore her words?");
                    examEnPS.put(195,"Does your father need it?");
                    examEnPS.put(196,"Why does it attract you?");
                    examEnPS.put(197,"I know they like it");
                    examEnPS.put(198,"He does it every day");
                    examEnPS.put(199,"How regularly do you learn English?");
                };
                runnable2.run();
            };
            runnable.run();
            return examEnPS;

        }
        private Map<Integer, String> getStrRuPS(){

            Runnable runnable = () -> {
                Runnable runnable1 = () -> {
                    examRuPS.put(0,"Как часто он тестирует их знания?");
                    examRuPS.put(1,"Я хочу знать Английский лучше");
                    examRuPS.put(2,"Мне действительно это нравится");
                    examRuPS.put(3,"Ты хочешь учиться лучше?");
                    examRuPS.put(4,"Он живет там");
                    examRuPS.put(5,"Этот тест кажется очень легким");
                    examRuPS.put(6,"Мне нужен твой совет");
                    examRuPS.put(7,"Мне нужно увидеть её");
                    examRuPS.put(8,"Она хотела бы поехать в другое место");
                    examRuPS.put(9,"В какое время ты обычно встаешь?");
                    examRuPS.put(10,"Она чувствует себя счастливой");
                    examRuPS.put(11,"Ты часто звонишь ему?");
                    examRuPS.put(12,"Как он добирается домой?");
                    examRuPS.put(13,"Что ты думаешь об этом?");
                    examRuPS.put(14,"Он не знает это");
                    examRuPS.put(15,"Что кажется бесполезным?");
                    examRuPS.put(16,"У нас достаточно практики?");
                    examRuPS.put(17,"Мне действительно нравятся эти уроки");
                    examRuPS.put(18,"Он живет в этой стране");
                    examRuPS.put(19,"Она хочет увидеть тебя прямо сейчас");
                    examRuPS.put(20,"Я хочу быть счастливым");
                    examRuPS.put(21,"У неё есть машина");
                    examRuPS.put(22,"Он хочет жить за границей?");
                    examRuPS.put(23,"Что твои друзья обычно заказывают?");
                    examRuPS.put(24,"Он работает очень усердно");
                    examRuPS.put(25,"Это зависит от них");
                    examRuPS.put(26,"Какие у него есть Английские книги?");
                    examRuPS.put(27,"Он хочет больше");
                    examRuPS.put(28,"Я очень хорошо тебя понимаю");
                    examRuPS.put(29,"Она объясняет все эти вещи очень хорошо");
                    examRuPS.put(30,"Она любит тебя");
                    examRuPS.put(31,"Эти уроки реально помогают");
                    examRuPS.put(32,"Она делает те упражнения регулярно");
                    examRuPS.put(33,"Она всегда делает это вовремя");
                    examRuPS.put(34,"Что помогает тебе?");
                    examRuPS.put(35,"Я хочу поехать за границу");
                    examRuPS.put(36,"Мне нужны деньги");
                    examRuPS.put(37,"Как часто она ходит в кино?");
                    examRuPS.put(38,"Что она хочет добавить?");
                    examRuPS.put(39,"Она работает очень усердно");
                    examRuPS.put(40,"Моя сестра учится там");
                    examRuPS.put(41,"Мне нравятся твои уроки");
                    examRuPS.put(42,"Кто любит её?");
                    examRuPS.put(43,"Я помню это");
                    examRuPS.put(44,"Я хочу новый компьютер");
                    examRuPS.put(45,"Что помогает ей?");
                    examRuPS.put(46,"Она живет в этом месте");
                    examRuPS.put(47,"Я хотел бы чашку коффе");
                    examRuPS.put(48,"Это не кажется странным");
                    examRuPS.put(49,"Что волнует тебя больше?");
                    examRuPS.put(50,"Как это помогает тебе?");
                    examRuPS.put(51,"Мои родители хотят сделать это");
                    examRuPS.put(52,"Все люди делают это");
                    examRuPS.put(53,"Сколько у него занимает по времени добраться до того места?");
                    examRuPS.put(54,"Он не пытается найти хорошую работу");
                    examRuPS.put(55,"Ты не пытаешся выучить Английский");
                    examRuPS.put(56,"Какого рода примеры его учитель дает?");
                    examRuPS.put(57,"Этот человек кажется очень хорошим?");
                    examRuPS.put(58,"Это не кажется полезным");
                    examRuPS.put(59,"Я думаю так");
                    examRuPS.put(60,"Они ходят на работу");
                    examRuPS.put(61,"Как она объясняет это?");
                    examRuPS.put(62,"Ей нужно исправить эти ошибки");
                    examRuPS.put(63,"Какую музыку ты предпочитаешь?");
                    examRuPS.put(64,"Моя сестра живет там, но я живу сдесь");
                    examRuPS.put(65,"Сколько по времени занимает у его дочери добраться в школу?");
                    examRuPS.put(66,"Тебе нужно запомнить это правило");
                    examRuPS.put(67,"Я живу в этой стране");
                    examRuPS.put(68,"Ты помнишь это");
                    examRuPS.put(69,"Я хожу на работу");
                    examRuPS.put(70,"Мне нужно говорить по Английски вовсе без каких-либо ошибок");
                    examRuPS.put(71,"Я все понимаю");
                    examRuPS.put(72,"Это помогает мне");
                    examRuPS.put(73,"Мне нравиться это");
                    examRuPS.put(74,"Который напиток она предпочитает: чай или коффе?");
                    examRuPS.put(75,"Ты поддерживаешь меня?");
                    examRuPS.put(76,"Почему твои родители не согласны с тобой?");
                    examRuPS.put(77,"Она чувствует себя такой счастливой");
                    examRuPS.put(78,"Он ходит на работу");
                    examRuPS.put(79,"Это зависит от нас");
                    examRuPS.put(80,"Он не навидит эту вещь?");
                    examRuPS.put(81,"Как часто ты ходишь туда?");
                    examRuPS.put(82,"Мне нравиться эта идея");
                    examRuPS.put(83,"Я не хочу учиться там");
                    examRuPS.put(84,"Когда у тебя есть свободное время?");
                    examRuPS.put(85,"Она смотрит различные фильмы");
                    examRuPS.put(86,"Ты часто слушаешь музыку?");
                    examRuPS.put(87,"Мне нравиться этот метод");
                    examRuPS.put(88,"Она пытается понять это");
                    examRuPS.put(89,"Это не вдохновляет меня");
                    examRuPS.put(90,"Я хочу это");
                    examRuPS.put(91,"Как часто ты думаешь об этом?");
                    examRuPS.put(92,"Где они проводят время вместе?");
                    examRuPS.put(93,"Я хотелбы выпить чашку коффе");
                    examRuPS.put(94,"Когда он чувствует себя счастливым?");
                    examRuPS.put(95,"Я не хочу жить в том городе");
                    examRuPS.put(96,"Кто хочет жить за границей?");
                    examRuPS.put(97,"Она не хочет обсуждать это");
                    examRuPS.put(98,"Твои уроки реально помогают");
                    examRuPS.put(99,"Он скучает по тебе");
                };
                runnable1.run();
                Runnable runnable2 = () -> {
                    examRuPS.put(100,"Я делаю это с большим удовольствием");
                    examRuPS.put(101,"Это привлекает меня");
                    examRuPS.put(102,"Почему она отказывается платить?");
                    examRuPS.put(103,"Этот урок кажется интересным");
                    examRuPS.put(104,"Как ты добираешься домой?");
                    examRuPS.put(105,"Он хочет больше практики");
                    examRuPS.put(106,"Тот тест кажется очень легким?");
                    examRuPS.put(107,"У нас достаточно знаний?");
                    examRuPS.put(108,"Как ты проводишь своё свободное время?");
                    examRuPS.put(109,"Она помнит все эти правила?");
                    examRuPS.put(110,"Почему это происходит снова и снова?");
                    examRuPS.put(111,"Они занимаются бизнесом?");
                    examRuPS.put(112,"Она припадаёт Английский?");
                    examRuPS.put(113,"Она читает на Английском");
                    examRuPS.put(114,"Она очень хорошо говорит по Английски");
                    examRuPS.put(115,"Они поддерживают нас?");
                    examRuPS.put(116,"Эти кажутся очень полезными");
                    examRuPS.put(117,"Он часто играет в компьютерные игры");
                    examRuPS.put(118,"Я практикую Английский каждый день");
                    examRuPS.put(119,"Мои родители знают это");
                    examRuPS.put(120,"Кто исправляет твои ошибки?");
                    examRuPS.put(121,"Её парень хочет поехать за границу?");
                    examRuPS.put(122,"Почему он говорит эти вещи снова и снова?");
                    examRuPS.put(123,"У него есть кот");
                    examRuPS.put(124,"Кто видит эти ошибки?");
                    examRuPS.put(125,"Эти вещи привлекают их");
                    examRuPS.put(126,"Я вижу тебе реально нравится Английский");
                    examRuPS.put(127,"Я хочу больше практики");
                    examRuPS.put(128,"Он часто думает об этом?");
                    examRuPS.put(129,"Почему ты думаешь так?");
                    examRuPS.put(130,"Мы говорим по Английски");
                    examRuPS.put(131,"Ты ходишь на работу?");
                    examRuPS.put(132,"Ты работаешь над своими ошибками?");
                    examRuPS.put(133,"Эти вещи кажутся не важными?");
                    examRuPS.put(134,"Что твой босс обычно отвечает?");
                    examRuPS.put(135,"Мне нужно учиться усерднее");
                    examRuPS.put(136,"Где ты работаешь?");
                    examRuPS.put(137,"Как регулярно ты практикуешь Английский?");
                    examRuPS.put(138,"Он так же работает сдесь");
                    examRuPS.put(139,"Этот студент показывает блестящие результаты?");
                    examRuPS.put(140,"Он очень хорошо понимает тебя");
                    examRuPS.put(141,"Что кажется странным?");
                    examRuPS.put(142,"Я живу в России");
                    examRuPS.put(143,"Мой друг не думает так");
                    examRuPS.put(144,"У него есть предложение");
                    examRuPS.put(145,"Почему он всегда жалуется об этом?");
                    examRuPS.put(146,"Он знает больше");
                    examRuPS.put(147,"Я все вижу");
                    examRuPS.put(148,"Он не хочет читать эти книги");
                    examRuPS.put(149,"Он часто смотрит телевизор?");
                    examRuPS.put(150,"Он думает так");
                    examRuPS.put(151,"Мне нравиться эта вещь");
                    examRuPS.put(152,"Он припадает Английский");
                    examRuPS.put(153,"Это не помогает мне");
                    examRuPS.put(154,"Я не хочу играть в компьютерные игры");
                    examRuPS.put(155,"Ты все помнишь?");
                    examRuPS.put(156,"Тебе нужен мой совет?");
                    examRuPS.put(157,"Мой босс читает все документы");
                    examRuPS.put(158,"Она делает это очень хорошо");
                    examRuPS.put(159,"Сколько денег у тебя с собой?");
                    examRuPS.put(160,"Он видит ту ошибку");
                    examRuPS.put(161,"Этот урок кажется полезным?");
                    examRuPS.put(162,"Кто поддерживает тебя?");
                    examRuPS.put(163,"Это кажется интересным");
                    examRuPS.put(164,"Я не согласен с тобой");
                    examRuPS.put(165,"Она скучает по тебе");
                    examRuPS.put(166,"Они поддерживают это решение?");
                    examRuPS.put(167,"Она действительно помнит это");
                    examRuPS.put(168,"Я хочу поблагодарить тебя");
                    examRuPS.put(169,"Я хочу знать это");
                    examRuPS.put(170,"Мы живем в этой стране");
                    examRuPS.put(171,"Мне действительно нужен Английский");
                    examRuPS.put(172,"Как он поддерживает тебя?");
                    examRuPS.put(173,"Мне нужно исправить эту ошибку");
                    examRuPS.put(174,"Он так же знает это");
                    examRuPS.put(175,"Как регулярно твой босс проверяет это?");
                    examRuPS.put(176,"Как чувствует твоя сестра?");
                    examRuPS.put(177,"Как регулярно он делает эти упражнения?");
                    examRuPS.put(178,"Я хочу поехать в другое место");
                    examRuPS.put(179,"Кого ты знаешь?");
                    examRuPS.put(180,"Эта вещь кажется не важной");
                    examRuPS.put(181,"Сколько у неё  занимает по времени добрать до этого места?");
                    examRuPS.put(182,"Что он помнит?");
                    examRuPS.put(183,"Почему ты согласен с ним?");
                    examRuPS.put(184,"Это реально происходит");
                    examRuPS.put(185,"Я хотел бы чашку чая");
                    examRuPS.put(186,"Мне нужна эта вещь");
                    examRuPS.put(187,"Он часто ходит в кино");
                    examRuPS.put(188,"Я хочу тренировать свою память");
                    examRuPS.put(189,"Они не занимаются бизнесом");
                    examRuPS.put(190,"Я не хочу говорить об этом");
                    examRuPS.put(191,"Она не хочет думать об этом");
                    examRuPS.put(192,"Она хочет сделать это прямо сейчас");
                    examRuPS.put(193,"Моему другу нужна твоя помощь");
                    examRuPS.put(194,"Он игнорирует её слова?");
                    examRuPS.put(195,"Твоему отцу нужно это?");
                    examRuPS.put(196,"Почему это привлекает тебя?");
                    examRuPS.put(197,"Я знаю им нравится это");
                    examRuPS.put(198,"Он делает это каждый день");
                    examRuPS.put(199,"Как регулярно ты занимаешься Английским?");
                };
                runnable2.run();
            };
            runnable.run();
            return examRuPS;

        }
        private Map<Integer, String> getStrEnToBe(){

            return examEnToBe;

        }
        private Map<Integer, String> getStrRuToBe(){


            return examRuToBe;

        }
    }
}
