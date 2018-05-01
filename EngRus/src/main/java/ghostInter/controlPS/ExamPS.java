package ghostInter.controlPS;

import java.util.HashMap;
import java.util.Map;

public class ExamPS
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

        Runnable runnable = () -> {
            examEn.put(0,"How often does he test their knowledge?");
            examEn.put(1,"I want to know English better");
            examEn.put(2,"I really like it");
            examEn.put(3,"Do you want to study better?");
            examEn.put(4,"He lives there");
            examEn.put(5,"This test seems very easy");
            examEn.put(6,"I need your advice");
            examEn.put(7,"I need to see her");
            examEn.put(8,"She'd like to go to another place");
            examEn.put(9,"What time do you usually get up?");
            examEn.put(10,"She feels happy");
            examEn.put(11,"Do you often call him?");
            examEn.put(12,"How does he get home?");
            examEn.put(13,"What do you think about it?");
            examEn.put(14,"He doesn't know it");
            examEn.put(15,"What seems useless?");
            examEn.put(16,"Do we have enough practice?");
            examEn.put(17,"I really like these lessons");
            examEn.put(18,"He lives in this country");
            examEn.put(19,"She wants to see you right now");
            examEn.put(20,"I want to be happy");
            examEn.put(21,"She has a car");
            examEn.put(22,"Does he want to live abroad?");
            examEn.put(23,"What do your friends usually order?");
            examEn.put(24,"He works very hard");
            examEn.put(25,"It depend on them");
            examEn.put(26,"What English books does he have?");
            examEn.put(27,"He wants more");
            examEn.put(28,"I understand you very well");
            examEn.put(29,"She explains all these things very well");
            examEn.put(30,"She loves you");
            examEn.put(31,"These lessons really help");
            examEn.put(32,"She does those exercises regularly");
            examEn.put(33,"She always does it on time");
            examEn.put(34,"What helps you?");
            examEn.put(35,"I want to go abroad");
            examEn.put(36,"I need money");
            examEn.put(37,"How often does she go to the cinema?");
            examEn.put(38,"What does she want to add?");
            examEn.put(39,"She works very hard");
            examEn.put(40,"My sister studies there");
            examEn.put(41,"I like your lessons");
            examEn.put(42,"Who love her?");
            examEn.put(43,"I remember it");
            examEn.put(44,"I want a new computer");
            examEn.put(45,"What helps her?");
            examEn.put(46,"She lives this place");
            examEn.put(47,"I'd like a cup of coffee");
            examEn.put(48,"It doesn't seem strange");
            examEn.put(49,"What worries you more?");
            examEn.put(50,"How does it help you?");
            examEn.put(51,"My parents want to do it");
            examEn.put(52,"All people do it");
            examEn.put(53,"How long does it take him to get to that place?");
            examEn.put(54,"He doesn't try to find a good job");
            examEn.put(55,"You don't try to learn English");
            examEn.put(56,"What kind of examples does his teacher give?");
            examEn.put(57,"Does this person seem very good?");
            examEn.put(58,"It doesn't seem useful");
            examEn.put(59,"I think so");
            examEn.put(60,"They go to work");
            examEn.put(61,"How does she explain it?");
            examEn.put(62,"She needs to correct these mistakes");
            examEn.put(63,"What music do you prefer?");
            examEn.put(64,"My sister lives these but I live here");
            examEn.put(65,"How long does it take his daughter to get to school?");
            examEn.put(66,"You need to remember this rule");
            examEn.put(67,"I live in this country");
            examEn.put(68,"Do you remember it?");
            examEn.put(69,"I go to work");
            examEn.put(70,"I need to speak English without any mistakes at all");
            examEn.put(71,"I understand everything");
            examEn.put(72,"It helps me");
            examEn.put(73,"I like it");
            examEn.put(74,"Which drink does she prefer: tea or coffee?");
            examEn.put(75,"Do you support me?");
            examEn.put(76,"Why do your parents disagree with you?");
            examEn.put(77,"She feels so happy");
            examEn.put(78,"He goes to work");
            examEn.put(79,"It depends on us");
            examEn.put(80,"Does he hate this thing?");
            examEn.put(81,"How often do you go there?");
            examEn.put(82,"I like this idea");
            examEn.put(83,"I don't want to study there");
            examEn.put(84,"When do you have free time?");
            examEn.put(85,"She watches different movies");
            examEn.put(86,"Do you often listen to music?");
            examEn.put(87,"I like this method");
            examEn.put(88,"She tries to understand it");
            examEn.put(89,"It doesn't inspire me");
            examEn.put(90,"I want it");
            examEn.put(91,"How often do you think about it?");
            examEn.put(92,"Where do they spend time together?");
            examEn.put(93,"I'd like to drink a cup of coffee");
            examEn.put(94,"When does he feel happy?");
            examEn.put(95,"I don't want to live in that city");
            examEn.put(96,"Who wants to live abroad?");
            examEn.put(97,"She doesn't want to discuss it");
            examEn.put(98,"Your lessons really help");
            examEn.put(99,"He misses you");
        };
        runnable.run();
        return examEn;

    }
    private Map<Integer, String> getStrRu(){

        Runnable runnable = new Runnable()
        {
            @Override
            public void run() {

                examRu.put(0,"Как часто он тестирует их знания?");
                examRu.put(1,"Я хочу знать Английский лучше");
                examRu.put(2,"Мне действительно это нравится");
                examRu.put(3,"Ты хочешь учиться лучше?");
                examRu.put(4,"Он живет там");
                examRu.put(5,"Этот тест кажется очень легким");
                examRu.put(6,"Мне нужен твой совет");
                examRu.put(7,"Мне нужно увидеть её");
                examRu.put(8,"Она хотела бы поехать в другое место");
                examRu.put(9,"В какое время ты обычно встаешь?");
                examRu.put(10,"Она чувствует себя счастливой");
                examRu.put(11,"Ты часто звонишь ему?");
                examRu.put(12,"Как он добирается домой?");
                examRu.put(13,"Что ты думаешь об этом?");
                examRu.put(14,"Он не знает это");
                examRu.put(15,"Что кажется бесполезным?");
                examRu.put(16,"У нас достаточно практики?");
                examRu.put(17,"Мне действительно нравятся эти уроки");
                examRu.put(18,"Он живет в этой стране");
                examRu.put(19,"Она хочет увидеть тебя прямо сейчас");
                examRu.put(20,"Я хочу быть счастливым");
                examRu.put(21,"У неё есть машина");
                examRu.put(22,"Он хочет жить за границей?");
                examRu.put(23,"Что твои друзья обычно заказывают?");
                examRu.put(24,"Он работает очень усердно");
                examRu.put(25,"Это зависит от них");
                examRu.put(26,"Какие у него есть Английские книги?");
                examRu.put(27,"Он хочет больше");
                examRu.put(28,"Я очень хорошо тебя понимаю");
                examRu.put(29,"Она объясняет все эти вещи очень хорошо");
                examRu.put(30,"Она любит тебя");
                examRu.put(31,"Эти уроки реально помогают");
                examRu.put(32,"Она делает те упражнения регулярно");
                examRu.put(33,"Она всегда делает это вовремя");
                examRu.put(34,"Что помогает тебе?");
                examRu.put(35,"Я хочу поехать за границу");
                examRu.put(36,"Мне нужны деньги");
                examRu.put(37,"Как часто она ходит в кино?");
                examRu.put(38,"Что она хочет добавить?");
                examRu.put(39,"Она работает очень усердно");
                examRu.put(40,"Моя сестра учится там");
                examRu.put(41,"Мне нравятся твои уроки");
                examRu.put(42,"Кто любит её?");
                examRu.put(43,"Я помню это");
                examRu.put(44,"Я хочу новый компьютер");
                examRu.put(45,"Что помогает ей?");
                examRu.put(46,"Она живет в этом месте");
                examRu.put(47,"Я хотел бы чашку коффе");
                examRu.put(48,"Это не кажется странным");
                examRu.put(49,"Что волнует тебя больше?");
                examRu.put(50,"Как это помогает тебе?");
                examRu.put(51,"Мои родители хотят сделать это");
                examRu.put(52,"Все люди делают это");
                examRu.put(53,"Сколько у него занимает по времени добраться до того места?");
                examRu.put(54,"Он не пытается найти хорошую работу");
                examRu.put(55,"Ты не пытаешся выучить Английский");
                examRu.put(56,"Какого рода примеры его учитель дает?");
                examRu.put(57,"Этот человек кажется очень хорошим?");
                examRu.put(58,"Это не кажется полезным");
                examRu.put(59,"Я думаю так");
                examRu.put(60,"Они ходят на работу");
                examRu.put(61,"Как она объясняет это?");
                examRu.put(62,"Ей нужно исправить эти ошибки");
                examRu.put(63,"Какую музыку ты предпочитаешь?");
                examRu.put(64,"Моя сестра живет там, но я живу сдесь");
                examRu.put(65,"Сколько по времени занимает у его дочери добраться в школу?");
                examRu.put(66,"Тебе нужно запомнить это правило");
                examRu.put(67,"Я живу в этой стране");
                examRu.put(68,"Ты помнишь это");
                examRu.put(69,"Я хожу на работу");
                examRu.put(70,"Мне нужно говорить по Английски вовсе без каких-либо ошибок");
                examRu.put(71,"Я все понимаю");
                examRu.put(72,"Это помогает мне");
                examRu.put(73,"Мне нравиться это");
                examRu.put(74,"Который напиток она предпочитает: чай или коффе?");
                examRu.put(75,"Ты поддерживаешь меня?");
                examRu.put(76,"Почему твои родители не согласны с тобой?");
                examRu.put(77,"Она чувствует себя такой счастливой");
                examRu.put(78,"Он ходит на работу");
                examRu.put(79,"Это зависит от нас");
                examRu.put(80,"Он не навидит эту вещь?");
                examRu.put(81,"Как часто ты ходишь туда?");
                examRu.put(82,"Мне нравиться эта идея");
                examRu.put(83,"Я не хочу учиться там");
                examRu.put(84,"Когда у тебя есть свободное время?");
                examRu.put(85,"Она смотрит различные фильмы");
                examRu.put(86,"Ты часто слушаешь музыку?");
                examRu.put(87,"Мне нравиться этот метод");
                examRu.put(88,"Она пытается понять это");
                examRu.put(89,"Это не вдохновляет меня");
                examRu.put(90,"Я хочу это");
                examRu.put(91,"Как часто ты думаешь об этом?");
                examRu.put(92,"Где они проводят время вместе?");
                examRu.put(93,"Я хотелбы выпить чашку коффе");
                examRu.put(94,"Когда он чувствует себя счастливым?");
                examRu.put(95,"Я не хочу жить в том городе");
                examRu.put(96,"Кто хочет жить за границей?");
                examRu.put(97,"Она не хочет обсуждать это");
                examRu.put(98,"Твои уроки реально помогают");
                examRu.put(99,"Он скучает по тебе");

            }
        };
        runnable.run();
        return examRu;

    }
}
