package ghostInter.control;

import java.util.HashMap;
import java.util.Map;

public class Exam
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
        examEnPS.put(200,"Does it seem interesting?");
        examEnPS.put(201,"How many dollars does he have with him?");
        examEnPS.put(202,"They go to school");
        examEnPS.put(203,"Do I have enough money?");
        examEnPS.put(204,"I want to do it");
        examEnPS.put(205,"My brother thies to do it");
        examEnPS.put(206,"She doesn't remember it");
        examEnPS.put(207,"I speak English");
        examEnPS.put(208,"His lessons seem very useful");
        examEnPS.put(209,"What does he want to add?");
        examEnPS.put(210,"Why do your friends disagree with you?");
        examEnPS.put(211,"We understand you");
        examEnPS.put(212,"What do you want to say?");
        examEnPS.put(213,"It looks interesting");
        examEnPS.put(214,"He doesn't have a car");
        examEnPS.put(215,"We need to solve this problem");
        examEnPS.put(216,"Does your mother tell him all the truth?");
        examEnPS.put(217,"It inspires me");
        examEnPS.put(218,"What inspires you?");
        examEnPS.put(219,"Who does she love?");
        examEnPS.put(220,"Does she often listen to the radio?");
        examEnPS.put(221,"I don't want to tell you about this problem");
        examEnPS.put(222,"What do you like here?");
        examEnPS.put(223,"Their ideas seem very interesting");
        examEnPS.put(224,"What does he need to change?");
        examEnPS.put(225,"Does his girlfriend understand it?");
        examEnPS.put(226,"I find all these lessons really useful");
        examEnPS.put(227,"Why do you depend on him?");
        examEnPS.put(228,"She also works there");
        examEnPS.put(229,"How does she train her memory?");
        examEnPS.put(230,"Do your parents understand it?");
        examEnPS.put(231,"You know it");
        examEnPS.put(232,"Why does your boss criticize it?");
        examEnPS.put(233,"I see he really likes it");
        examEnPS.put(234,"I don't want to know it");
        examEnPS.put(235,"Does that lesson seem boring?");
        examEnPS.put(236,"Does she ignore it sometimes?");
        examEnPS.put(237,"It attracts him");
        examEnPS.put(238,"Does she want to go abroad?");
        examEnPS.put(239,"I want to speak English fluently and correctly");
        examEnPS.put(240,"Where do you go?");
        examEnPS.put(241,"This lesson helps me");
        examEnPS.put(242,"They often criticize him");
        examEnPS.put(243,"Her brother often says it");
        examEnPS.put(244,"Do you like that offer?");
        examEnPS.put(245,"She tries to learn English");
        examEnPS.put(246,"Do they see their mistakes?");
        examEnPS.put(247,"Do you like it?");
        examEnPS.put(248,"Does your friend agree with you?");
        examEnPS.put(249,"My sister lives in this place");
        examEnPS.put(250,"I have an idea");
        examEnPS.put(251,"How do you usually get to that place?");
        examEnPS.put(252,"I don't understand these people");
        examEnPS.put(253,"How regularly do you speak English?");
        examEnPS.put(254,"He has dollars");
        examEnPS.put(255,"I know it");
        examEnPS.put(256,"This thing attracts me");
        examEnPS.put(257,"What time does she leave home?");
        examEnPS.put(258,"When do you feel happy?");
        examEnPS.put(259,"He'd like to become a doctor");
        examEnPS.put(260,"He makes so many mistakes");
        examEnPS.put(261,"What books do you read?");
        examEnPS.put(262,"She goes to scholl");
        examEnPS.put(263,"I support this decision");
        examEnPS.put(264,"Who does it motivate?");
        examEnPS.put(265,"It seems useless");
        examEnPS.put(266,"Do you have free time?");
        examEnPS.put(267,"Do you agree with him?");
        examEnPS.put(268,"What channels does he watch?");
        examEnPS.put(269,"I'd like to visit this place");
        examEnPS.put(270,"We like it");
        examEnPS.put(271,"I love you");
        examEnPS.put(272,"What time does your mother come to work?");
        examEnPS.put(273,"She watches TV");
        examEnPS.put(274,"Why do you want to visit this place?");
        examEnPS.put(275,"Who does he support?");
        examEnPS.put(276,"He wants to buy this thing");
        examEnPS.put(277,"She wants more practice");
        examEnPS.put(278,"I don't want to say it");
        examEnPS.put(279,"Does this thing seem important?");
        examEnPS.put(280,"Does he often speak English?");
        examEnPS.put(281,"My friend likes this hotel");
        examEnPS.put(282,"I really want it");
        examEnPS.put(283,"Does it seem boring?");
        examEnPS.put(284,"I feel it");
        examEnPS.put(285,"It happens");
        examEnPS.put(286,"What kind of comruter games do they play?");
        examEnPS.put(287,"I need to solve these problems");
        examEnPS.put(288,"I like this channel");
        examEnPS.put(289,"Those lessons don't help me at all");
        examEnPS.put(290,"Why does it look strange?");
        examEnPS.put(291,"How often do you go to the gym?");
        examEnPS.put(292,"Does this information seem unimportant?");
        examEnPS.put(293,"Do you agree with her?");
        examEnPS.put(294,"I work here");
        examEnPS.put(295,"What does she want to add?");
        examEnPS.put(296,"I'd like to know English very well");
        examEnPS.put(297,"Our mother thinks the same");
        examEnPS.put(298,"That offer seems strange");
        examEnPS.put(299,"This project seems very interesting");

        return examEnPS;
    }
    private Map<Integer, String> getStrRuPS(){
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
        examRuPS.put(200,"Это кажется интересным?");
        examRuPS.put(201,"Сколько долларов у него с собой?");
        examRuPS.put(202,"Они ходят в школу");
        examRuPS.put(203,"У меня достаточно денег?");
        examRuPS.put(204,"Я хочу сделать это");
        examRuPS.put(205,"Мой брат пытается делать это");
        examRuPS.put(206,"Она не помнит это");
        examRuPS.put(207,"Я говорю по Английски");
        examRuPS.put(208,"Его уроки кажутся очень полезными");
        examRuPS.put(209,"Что он хочет добавить?");
        examRuPS.put(210,"Почему твои друзья не согласны с тобой?");
        examRuPS.put(211,"Мы понимаем тебя");
        examRuPS.put(212,"Что ты хочешь сказать?");
        examRuPS.put(213,"Это выглядит интересным");
        examRuPS.put(214,"У него нет машины");
        examRuPS.put(215,"Нам нужно решить эту проблему");
        examRuPS.put(216,"Твоя мама говорит ему всю правду?");
        examRuPS.put(217,"Это вдохновляет меня");
        examRuPS.put(218,"Что вдохновляет тебя?");
        examRuPS.put(219,"Кого она любит?");
        examRuPS.put(220,"Она часто слушает радио?");
        examRuPS.put(221,"Я не хочу говорить тебе об этой проблеме");
        examRuPS.put(222,"Что тебе нравиться сдесь?");
        examRuPS.put(223,"Их идеи кажутся очень интересными");
        examRuPS.put(224,"Что ему нужно изменить?");
        examRuPS.put(225,"Его девушка понимает это?");
        examRuPS.put(226,"Я нахожу все эти уроки реально полезными");
        examRuPS.put(227,"Почему ты зависишь от него?");
        examRuPS.put(228,"Она так же работает там");
        examRuPS.put(229,"Как она тренирует свою память?");
        examRuPS.put(230,"Твои родители понимают это?");
        examRuPS.put(231,"Ты знаешь это");
        examRuPS.put(232,"Почему твой босс критикует это?");
        examRuPS.put(233,"Я вижу ему реально это нравится");
        examRuPS.put(234,"Я не хочу знать это");
        examRuPS.put(235,"Тот урок кажется скучным?");
        examRuPS.put(236,"Она игнорирует это иногда?");
        examRuPS.put(237,"Это привлекает его");
        examRuPS.put(238,"Она хочет поехать за границу?");
        examRuPS.put(239,"Я хочу говорить по Английски свободно и правильно");
        examRuPS.put(240,"Куда ты ходишь?");
        examRuPS.put(241,"Этот урок помогает мне");
        examRuPS.put(242,"Они часто критикуют его");
        examRuPS.put(243,"Её брат часто говорит это");
        examRuPS.put(244,"Тебе нравится то предложение?");
        examRuPS.put(245,"Она пытается выучить Английский");
        examRuPS.put(246,"Они видят свои ошибки?");
        examRuPS.put(247,"Тебе нравится это?");
        examRuPS.put(248,"Твой друг согласен с тобой?");
        examRuPS.put(249,"Моя сестра живет в этом месте");
        examRuPS.put(250,"У меня есть идея");
        examRuPS.put(251,"Как ты обычно добираешся до того места?");
        examRuPS.put(252,"Я не понимаю этих людей");
        examRuPS.put(253,"Как регулярно ты говоришь по Английски");
        examRuPS.put(254,"У него есть доллары");
        examRuPS.put(255,"Я знаю это");
        examRuPS.put(256,"Эта вещь привлекает меня");
        examRuPS.put(257,"В какое время она уходит из дома?");
        examRuPS.put(258,"Когда ты чувствуешь себя счастливой?");
        examRuPS.put(259,"Он хотел бы стать врачем");
        examRuPS.put(260,"Он делает так много ошибок");
        examRuPS.put(261,"Какие книги ты читаешь?");
        examRuPS.put(262,"Она ходит в школу");
        examRuPS.put(263,"Я поддерживаю это решение");
        examRuPS.put(264,"Кого это мотевирует?");
        examRuPS.put(265,"Это кажется бесполезным");
        examRuPS.put(266,"У тебя есть свободное время?");
        examRuPS.put(267,"Ты согласен с ним?");
        examRuPS.put(268,"Какие каналы он смотрит?");
        examRuPS.put(269,"Я хотел бы посетить это место");
        examRuPS.put(270,"Нам наравиться это");
        examRuPS.put(271,"Я люблю тебя");
        examRuPS.put(272,"В какое время твоя мама приходит на работу?");
        examRuPS.put(273,"Она смотрит ТВ");
        examRuPS.put(274,"Почему ты хочешь посетить это место?");
        examRuPS.put(275,"Кого он поддерживает?");
        examRuPS.put(276,"Он хочет купить эту вещь");
        examRuPS.put(277,"Она хочет больше практики");
        examRuPS.put(278,"Я не хочу сказать это");
        examRuPS.put(279,"Эта вещь кажется важной?");
        examRuPS.put(280,"Он часто говорит по Английски?");
        examRuPS.put(281,"Моему другу нравиться этот отель");
        examRuPS.put(282,"Я действительно хочу это");
        examRuPS.put(283,"Это кажется скучным?");
        examRuPS.put(284,"Я чувствую это");
        examRuPS.put(285,"Это происходит");
        examRuPS.put(286,"Какого рода компьютерные игры они играют?");
        examRuPS.put(287,"Мне нужно решить эти проблемы");
        examRuPS.put(288,"Мне нравиться этот канал");
        examRuPS.put(289,"Те уроки мне вовсе не помогают");
        examRuPS.put(290,"Почему это выглядит странным?");
        examRuPS.put(291,"Как часто ты ходишь в зал?");
        examRuPS.put(292,"Эта информация кажется не важной?");
        examRuPS.put(293,"Ты согласен с ней?");
        examRuPS.put(294,"Я работаю сдесь");
        examRuPS.put(295,"Что она хочет добавить?");
        examRuPS.put(296,"Я хотел бы очень хорошо знать Английский");
        examRuPS.put(297,"Наша мама думает так же");
        examRuPS.put(298,"То предложение кажется странным");
        examRuPS.put(299,"Этот проект кажется очень интересным");

        return examRuPS;
    }
    private Map<Integer, String> getStrEnToBe(){

        return examEnToBe;

    }
    private Map<Integer, String> getStrRuToBe(){


        return examRuToBe;

    }
}