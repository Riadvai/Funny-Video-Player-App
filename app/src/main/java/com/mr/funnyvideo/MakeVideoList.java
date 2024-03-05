
package com.mr.funnyvideo;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//==========================================================================
		addVideoItem("HgRFb-H2-vM", "Fake Lion Prank Dog So Funny Can Not Stop Laugh", "Prank like a FakeLion scares dogs. This is a FunnyVideo about how a guy with a fake lion sneaks up on a sleeping dog.");
		addVideoItem("69G11hVl0zk", "Cute funny pets video", "This edited video is for entertainment purposes only.");
		addVideoItem("n2M9jcLpkNs", "Dog V/S Mirro ॥Comedy Video॥", "This  video is for just entertainment purposes only");
		addVideoItem("07d2dXHYb94", "A Short Animated cartoon Dogs", "A heartwarming tale for underdogs everywhere, Pip is the story of a small dog with a big dream");
		addVideoItem("ZWjk2L4wJH0", "Cute Dog Funny Video", "In this video, you will discover the strangest funny dog");
		addVideoItem("J458dHqrYdc", "Cute funny pet's cat and dog video", "This edited video is just for entertainment purposes only.");
		addVideoItem("cDR50p4JPsA", "Aluminum Box vs Prank Dog Very Funny", "Must Watch Funny Comedy New Prank With Try To Stop Laugh a sleeping dog.");
		addVideoItem("QpRlYtlLbA0", "Super Funny Prank video with dog", "Super Funny Prank video This edited video is for entertainment purposes only.");
		addVideoItem("GKffAaxmOVY", "Video Funny dog", "Video Funny dog Look at my Dog sleep");
		addVideoItem("ScjZlWUYjU0", "SRTV Club Video", "SRTV Club Video Funny Video dog sleep");
		addVideoItem("Dad0ocIFgWk", "Funny animal sleep video", "This video is very funny Funny animal sleep video");
		addVideoItem("6uY0dRI3YmQ", "Funny Video prank dog sleep", "This video is very funny Funny Video prank dog sleep");
		addVideoItem("lXRDzsVLFlE", "sleeping dog prank", "This  video is for just entertainment sleeping dog prank");
		addVideoItem("Liv8mP5p0yc", "Best Dog Prank ", "Super Big Box vs Prank Sleep Dog Very Funny With Surprise Reaction  Must Watch Now");
		addVideoItem("QaqeddsmC_g", "Serious Dog Prank Back Pranker Very Funny ", "Serious Dog Prank Back Pranker Very Funny  Must Watch Most Funny Comedy Video Prank 2021");
		addVideoItem("ucXVQsbxlWo", "Best Funny Dog Prank Fail Inside BIG BOX ", "Best Funny Dog Prank Fail Inside BIG BOX  Must Watch Most Funny Comedy Video  Try To Stop Laugh ");
		addVideoItem("txtNt62F678", "Aluminum Box Prank Dog Sleeping Very Funny Must Watch Most Funny", "Aluminum Box Prank Dog Sleeping Very Funny Must Watch Most Funny  Must Watch Very Funny Comedy");
		addVideoItem("q_4Hz3-7Tew", "Fake Tiger Vs Dog Prank 2020", "Must Watch New Prank Try To Not Laugh Challenge Fake Lion Prank Dogs");
		addVideoItem("FUqttxtk8y0", "Evangeline - Animated Short Film", "The Filmakademie Baden-Wuerttemberg, with its Animationsinstitut and the postgraduate masterclass Atelier Ludwigsburg-Paris, is one of the internationally most acclaimed film and media schools.");
		addVideoItem("iTFfVAdk7z4", "Dog Prank on Mirror", "The purpose and environment of this video is to fulfill their needs and desires.");
		addVideoItem("H40v3ISrHhQ", "Courage The Cowardly Dog  Mega Collection", "Enjoy an assortment of spooky moments from your favourite quivering canine Courage the Cowardly Dog");
		addVideoItem("WfxQuD9weWM", "CG Short film The Present by Jacob Frey ** Award winning", "One day his Mum decides to get a little surprise for her son");
		addVideoItem("ZWjk2L4wJH0", "The Beginning of freedom", "The Philippine Animation Festival");
		addVideoItem("x1Ts_X0JEHs", "kuchha smjme nhi aa raha hai", "yaha tk aye ho to aap subscribe  aur like jrur krna bhulna mt");
		addVideoItem("SgKKZXuiTac", " FLASH ANIMATION", "Flash accessible version");
		addVideoItem("D_Rx4qZ8QRc", "Take Me Home by Nair Archawattana ", "TheCGBros Presents Take Me Home by Nair Archawattana  Watch this touching animated short film In a cold, dark dog shelter, a young beagle is waiting for the right one to take him home");
		addVideoItem("BTSH3hxdk_A", "Dustin byTheDustinTeam","Dustin is an animated comedy about a pug who, much to his chagrin has to arrange with an automatic cleaning robot as his roommate");
		addVideoItem("ZLlf8lN7p4I", "THE QUEEN'S CORGI Clips You Don't Earn Respect", "Let us know what you think in the comments below bhulan mt.");
		addVideoItem("BUslHzAwv_Q", "Big Fake Lion vs Real Dogs Prank Challenge 2021", "Double Prank Big Fake Lion & Fans Horn Prank Dogs");
		addVideoItem("SN9IKt4HwZU", "Big Box vs Real Dogs Prank Very Funny with Surprise Scared Reaction", "Big Box vs Real Dogs Prank Very Funny with Surprise Scared Reaction  Try Not To Laugh");
		addVideoItem("mUvmhynU_lY", "IF WAS NOT RECORDED YOU WOULDN'T BELIEVE", "This  video is for just entertainment purposes only Funny Animal Videos");
		addVideoItem("WEhBCmW4Jjc", "As Melhores Reações a Peidos ", "As Melhores Reações a Peidos de Cães e Gatos Muito Engraçados");
		addVideoItem("mHLSYh1st7g", "Husky Pranked By Scary Big Foot", "Scary Big Foot Comes To Life Prank On My Dogs");
		addVideoItem("Do9SbDBbD-k", "Deixei os 3 sozinhos com um prato cheio de frango assado","Confesso que fiquei surpreendido com o comportamento do pastor malinois nesse vídeo");
		addVideoItem("ba-kCVmFWqA", "Funny Cats and Dogs Videos", "Here is a beautiful compilation of funny Short");
		addVideoItem("9neg1a5MA7Q", "Funniest Cats And Dogs Video", "Funny Animal Videos 2023, Funniest Dogs And Cats Videos ");
		addVideoItem("EKK8Xkx0m1M", "Funniest Dog Reactions During Bath Time", "Beautiful and fun compilation of videos starring our beloved dogs struggling with the much dreaded and sometimes beloved bath time funny dog and cat clips ");
		addVideoItem("K7T_J4CYtJM", "The Full 4 Year Story Of My Husky & Baby Becoming Best Friends", "The Full 4 Year Story Of My Husky & Baby Becoming Best Friends");
		addVideoItem("s4MI2DTWeog", "Funniest Cat and dog's Videos", "This edited video is for entertainment purposes only. I'm just trying to make everyone laugh!");
		addVideoItem("vItu3gZKneA", "Funny Cat and dog video |Funniest Cats and dog  Videos ", " dogs and cat's are amazing pets because they are the cutest and most funny. Watching funny baby dogs is the hardest try not to laugh challenge. ");
		addVideoItem("zNtMenPfDlQ", "Funny Dog Videos Try Not To Laugh", "Funny Animal Videos, Funniest Dogs And Cats Videos ");
		addVideoItem("4yrvdNvZGAw", "Attack Of The Funny Dogs", "In this video, you will see funny dog and cat clips ");
		addVideoItem("XoaqK130q5A", "Funniest Dog's  Videos", "EPIC Dog's FIGHTS | REAL SOUND.");
		addVideoItem("9ZzmVkeAlec", "Funny French Bulldog", "clips with cute and funny Frenchie Bulldogs make you laugh.");
		addVideoItem("or6x4zHGTMc", "What Do My Dogs Do Every Morning", "My French Bulldog's Morning Routine");
		addVideoItem("Vam5k6vpISA", "Best of the best video funny animal's", "This  video is for just entertainment purposes only Funny Animal Videos");
		addVideoItem("7WojSl4hXAU", "Cool and cute animals Funny Video", "funny cats and dogs");
		addVideoItem("Mx_7uZhKL84", "German Shepherd Puppy Meets Mom Cat with Newborn", "Enjoy new funniest and cutest video of the German Shepherd Puppy Meets Mom Cat with Newborn Kittens for the First Time");
		addVideoItem("XJRMuJAjAl0", "Molly the Dog and Milo the Cat Play Time", "This  video is for just entertainment purposes only Funny Animal Videos");
		createPlayList("Funny Dog", R.drawable.category_1);
		//==========================================================================

		//==========================================================================
		addVideoItem("KoWRdeZADms", "New Cutest Cats Funny Videos 2023", "New Funny Cute Cats Video");
		addVideoItem("XwxceWfhWos", "Funny cats videos ever 2023", "This edited video is for entertainment purposes only. I'm just trying to make everyone laugh!");
		addVideoItem("jH7e1fDcZnY", "Funny Cat video | The Cat Raised by a Mouse", "The story of how Phil became to be Phil. The Cat Raised by a Mouse. ");
		addVideoItem("k9nRLWuqEYc", "Funniest Cats And Dogs Video", "Funny Animal Videos 2023, Funniest Dogs And Cats Videos ");
		addVideoItem("oEhLf5LgcGA", "Bloody Brother Cats Meowing Fighting", "You'll Regret Skipping Watching This Video | Viral Cat");
		addVideoItem("V7nrZF_EJN8", "Cats Fighting and Meowing ", "These Two are Bloody Brothers | Viral Cat");
		addVideoItem("504gag8074w", "4K Quality Animal Footage", "Cats and Kittens Beautiful Scenes Episode 9 | Viral Cat");
		addVideoItem("DXUAyRRkI6k", "Funny Cats and Kittens Meowing Compilation", "Funny Cats and Kittens Meowing Compilation ");
		addVideoItem("KoWRdeZADms", "New Funny Videos 2022  Cutest Cats and Dogs  Part11", "New Funny Videos 2022  Cutest Cats and Dogs  Part11");
		addVideoItem("LggOjXV-vo8", "Funny animals. A domestic cat", "Funny animals. A domestic cat. Video with pets. Playing with a cat.");
		addVideoItem("ULP4sk2A2_g", "Funny animals. A domestic cat", "Funny animals. A domestic cat. Video with pets. Playing with a cat.FUNNY CATS 3.mov");
		addVideoItem("9PDp6ZgrDLQ", "Funny animals |Funniest Cats  Videos ", "Funny animals | An adorable set of cats and dogs to lift your spirits ");
		addVideoItem("GTkFFodgUac", "Funny animals cats and dogs", "| An adorable set of cats and dogs to lift your spirits");
		addVideoItem("PN5JbFlMoY8", "ANIMALS GOING GOBLIN MODE", "FUNNY ANIMALS, CATS & DOGS DAY 3 ");
		addVideoItem("-m6B2EqQChI", "Funny animals cats and dogs", "An adorable set of cats and dogs to lift your spirits");
		addVideoItem("-jXrmc7J7Qc", "Funny animals ", "An adorable set of cats and dogs to lift your spirits");
		addVideoItem("dm0UyvqF89Q", "Full Episode  Cartoon Animation for Kids", "Everyone thinks it’s super-duper adorable, especially Iris");
		addVideoItem("3DyhImD1L10", "Kuttikurumbi New Malayalam Kid's nursery song from Kathu 4", "Kuttikurumbi New Malayalam Kid's");
		addVideoItem("ao39zp8ZdPQ", "Aru Paranju Myavo | malayalam cartoon | ani", "♥  Aru paranju Myavoo  ♥ with Subtitles ♥ Kathu Pupi(Pupy) Manchadi ");
		addVideoItem("_d022tCOwJo", "  malayalam animation | cartoon story for kids", "NEW KATHU Story For Kids 2016 ");
		addVideoItem("S2BfESvAKJA", " New Malayalam nursery song from Kathu ", "★ Kuttikkurumbee ★Malayalam nursery rhyme from New Kathu (Kathu 4) ♥ We need your support to create more videos  ");
		addVideoItem("jnYq5pjOGc", "New 2022 Bablu Dablu Cartoon In Bangla", "Subscribe for More Bengali Bablu Dablu Cubs");
		addVideoItem("EtqCAWkPz3M", "Bablu Dablu Cartoon In Bangla", "New Bears Cartoon Story For Kids");
		addVideoItem("JpA6KCHK5tM", "Kids Poems In Hindi | Hindi Balgeet ", "These collections of popular Hindi Rhymes are presented by Super Kids Network. ");
		addVideoItem("dm0UyvqF89Q&t=17s", "White Cat Episode 161", "Everyone thinks it’s super-duper adorable, especia ");
		addVideoItem("FQscQDXVaAg", "", "Fluffy and the turtles are in love with their new m ");
		addVideoItem("CkAuC86OoC8", "Vlad dan Niki bermain dengan", "Video menyenangkan untuk ana.");
		addVideoItem("2z3jNYxNVD4", "Lagu Anak Terpopuler", "Si Meong Kucing Lucu Bermain Bola Lagu Anak Terpopul.");
		addVideoItem("bxEq4zIyy0E", "Fofo Aventuras", "Gatinho Fofo Aventuras - Desenhos Animados Divertidos.");
		addVideoItem("HpRRJ2pt-oU", "Nastya yavru kedilerine nasıl bakıyor", "Nastya'nın yavru kedileri var.Şimdi yavru kedilere bakması gerekiyor.s");
		addVideoItem("LyqklQSkVxI", "Nastya Learns How To Foster a Kittens", "TNastya is trying to put the kittens to bed and feed them. But they don't want to eat and sleep");
		addVideoItem("iXF1Wph2vBE", "Funny animals cats and dogs ", " An adorable set of cats and dogs to lift your spirits");
		addVideoItem("HBMIm0FLZx8", "Funny animals cats and dogs", "An adorable set of cats and dogs to lift your spirits");
		addVideoItem("J3SotIfOklk", "Funny Shrilling chicken with animals ", "Very funny video Funny Shrilling chicken with animals ");
		addVideoItem("HeAWhxqf2Os", "ラバーチキン", "ラバーチキン");
		addVideoItem("pa4b57fOX_c", "Funniest Animals", "Funniest Animals  Funny Cats and Dogs 2023  Part 18");
		addVideoItem("de0NIRJPwgY", "Funniest Cats  Videos", "In this video, you will discover the strangest funny dog and cat clips ");
		addVideoItem("6RT9Dqf4Bos", "Laugh with us Funny Cat's", "In this video, cute cats will make you laugh");
		addVideoItem("eQ2RXMobxdw", "Funniest Cat Videos", "This edited video is for entertainment purposes only. I'm just trying to make everyone laugh!");
		addVideoItem("bLLqN4MjoxE", "Funny Cat video |Funniest Cats  Videos ", "Baby dogs are amazing pets because they are the cutest and most funny. Watching funny baby dogs is the hardest try not to laugh challenge. ");
		addVideoItem("800mznOK6Vc", "These are the cutest animals ever", "Funny Animal Videos, Funniest Dogs And Cats Videos ");
		addVideoItem("W9SWyqGA9rI", "Funniest Cats  Videos", "In this video, you will see funny dog and cat clips ");
		addVideoItem("qu8PND9Bhfw", "EPIC CAT FIGHTS | REAL SOUND", "EPIC CAT FIGHTS | REAL SOUND.");
		addVideoItem("KMvwfLQhA_Y", "Angry Cats VS Dogs Funny Compilation", "New compilation funny.Most angry cats make you laugh.");
		addVideoItem("bxEq4zIyy0E", "The funny reaction of cats who saw a toy snake", "The funny reaction of cats who saw a toy snake.This  video is for just entertainment purposes only");
		addVideoItem("ScTVaNFfH6Y", "Animales tirandosen gases de la forma mas divertida", "This  video is for just entertainment purposes only Funny Animal Videos");
		addVideoItem("9p6VwtPwVqQ", "Cute cat and dog Funny Video", "In this video, you will discover the strangest funny cat and dog");
		addVideoItem("by4nkJxQALs", "Cute funny pet's Funniest Cats and Dogs", "You can enjoy best funny cats and dogs videos");
		addVideoItem("BrNXhYV0FRc", "Cute Pets,funny pets playing,funny clips", "This  video is for just entertainment purposes only Funny Animal Videos");
		createPlayList("Funny Cat", R.drawable.category_2);
		//==========================================================================


		//==========================================================================
		addVideoItem("nU41BYFJAv8", "Baby Dance Scooby Doo Pa Pa Funny Video", "Baby Dance Scooby Doo Pa Pa funny Video");
		addVideoItem("qp-lJMrSyhY", "The Boss Baby", "You can enjoy best funny Baby videos");
		addVideoItem("w-TXkYlIEMY", "Baby Boss Born episode", "BOSS BABY Jason Derulo Savage Love ");
		addVideoItem("cJqXmyuxGYc", "Baby Boss Ed Sheeran Shape of You", "Baby Dance Baby Boss Music funny Video");
		addVideoItem("lidYDN2YgKY", "Top Cute Babies Dancing Compilations ", "In this video, you will discover the strangest funny Baby");
		addVideoItem("ETGBY1oCmBY", "Cute Baby Doll ", "You can enjoy best funny Baby's videos");
		addVideoItem("F9Ow8yW0c3E", "Like Father like Baby", "Cute Babies trying to Copy Daddy Funny way Compilation ");
		addVideoItem("GG_1eBDTWrI", "Cute Baby Laughing Video", "Baby Funny Videos  Cute Kids  Day 14");
		addVideoItem("VwcARAbhnrc", "Laugh Out Loud With Cute Babies Funny Moments", "Laugh Out Loud With Cute Babies Funny Moments | ỐC Family");
		addVideoItem("H4r9YWLzYG0", "কিউট বেবিদের এমন কাজকর্ম দেখলে আপনিও হাসি থামাতে পারবেন না Part 3", "কিউট বেবিদের এমন কাজকর্ম দেখলে আপনিও হাসি থামাতে পারবেন না Part 3");
		addVideoItem("1T5FX3zjuN8", "কিউট বেবিদের এমন কাজকর্ম দেখলে আপনিও হাসি থামাতে পারবেন না Part 5", "কিউট বেবিদের এমন কাজকর্ম দেখলে আপনিও হাসি থামাতে পারবেন না Part 5 FactsTube Bangla  Cute Baby");
		addVideoItem("nU41BYFJAv8", "Baby Dance Scooby Doo Pa Pa Funny Video", "Baby Dance Scooby Doo Pa Pa funny Video");
		addVideoItem("KyYdKIuM2sQ", "Funny Babies Playing With Water ", "In this video, you will discover the strangest funny Baby");
		addVideoItem("qp-lJMrSyhY", "The Boss Baby", "You can enjoy best funny Baby videos");
		addVideoItem("w-TXkYlIEMY", "Baby Boss Born episode", "BOSS BABY Jason Derulo Savage Love ");
		addVideoItem("cJqXmyuxGYc", "Baby Boss Ed Sheeran Shape of You", "Baby Dance Baby Boss Music funny Video");
		addVideoItem("lidYDN2YgKY", "Top Cute Babies Dancing Compilations ", "In this video, you will discover the strangest funny Baby");
		addVideoItem("ETGBY1oCmBY", "Cute Baby Doll ", "You can enjoy best funny Baby's videos");
		addVideoItem("F9Ow8yW0c3E", "Like Father like Baby", "Cute Babies trying to Copy Daddy Funny way Compilation ");
		createPlayList("Funny Baby", R.drawable.category_3);
		//==========================================================================


		//==========================================================================
		addVideoItem("HOYpAgWPTps","Ice Cream | Funny Episodes | Mr Bean Cartoon World","Ice Cream | Funny Episodes | Mr Bean Cartoon World");
		addVideoItem("7s-8cG7mwqc","Would You Date Mr Bean", "Would You Date Mr BeanMr  | New Funny Clips");
		addVideoItem("du4DDUcC2gw","AIRPLANE Bean |Mr Bean  | Funny Clips","AIRPLANE Bean  Bean  Funny Clips Video");
		addVideoItem("QTli1HU9axY","Art DISASTER |Mr Bean  | Funny Clips","Art DISASTER  Bean Funny Clips Video");
		addVideoItem("D-qj0L68RhQ","Hair by Mr Bean of London |Mr bean","Hair by Mr Bean of London Funny Clips Video ");
		addVideoItem("tyAeM5kX9Z4","The HOTEL Trip (Try Not To Laugh) | Mr Bean ","The HOTEL Trip Try Not To Laugh Mr Bean Funny Clips Video  ");
		addVideoItem("vFDSWuffBcA","Operation Mr Bean | Funny Clips | Classic Mr. Bean","Operation Mr Bean Funny Clips video");
		addVideoItem("wBtFWKSCKZ4","Bean ARMY | Funny Clips | Mr Bean Comedy","Mr Bean ARMY Funny Clips video");
		addVideoItem("nTnzqzO7xR0","Die Wäsche waschen | Lustige Clips | Mr Bean Deutschland","Die Wäsche waschen Lustige Clips Mr Bean Deutschland video");
		addVideoItem("iVCt3OLPsFM","Mr Bean | Folge  | Mr Bean Deutschland","Mr Bean  Folge  Mr Bean Deutschland Funny Clips Video");
		addVideoItem("vLKA3plTsHQ","Strictly BEAN (Try Not To Laugh!) | Funny Clips | Mr Bean Comedy","Strictly BEAN Try Not To Laugh Funny Clips Mr Bean Comedy Funny Clips Video");
		addVideoItem("Bb90tC5UpQw","Mr Bean in 'Torvill and Bean' | Comic Relief ","Mr Bean in Torvill and Bean Comic Relief Funny Clips Video");
		addVideoItem("FPU2JICJ7nY","Fly Away BEAN | Mr Bean Full Episodes | Mr Bean Official","Fly Away BEAN Mr Bean Official Funny Clips Video ");
		addVideoItem("_Vx3lWoDJXY","Library BEAN | RARE episode | Mr Bean Official","Library BEAN RARE episode Mr Bean Official Funny Clips Video.");
		addVideoItem("yGqP54lv9q4","One Wedding and a Funeral | Funny Clip | Classic Mr Bean", "One Wedding and a Funeral  Funny Clip Classic Mr Bean Funny Clips Video");
		addVideoItem("Ba9iJ7XZppU","Mr Bean - Treffen mit der Queen","Mr Bean  Treffen mit der Queen Funny Clips Video");
		addVideoItem("ZQIkxlV8lCI","Mr Bean Gets Fired!","Mr Bean's Holiday | Mr Bean");
		addVideoItem("tyAeM5kX9Z4","The HOTEL Trip (Try Not To Laugh)","Mr Bean Full Episodes | Mr Bean Official");
		addVideoItem("NVhmq-pB_cs","Time To Cool Off with Mr Bean ","Time To Cool Off with Mr Bean | Classic Mr Bean ");
		addVideoItem("G9nqB8BwGHU","The Trouble with Mr Bean","Widescreen Version | Mr Bean Official  ");
		addVideoItem("G6LlfiaEixM","Mr Bean im Schwimmbad"," Lustige Clips | Mr Bean Deutschland");
		addVideoItem("wX3K_NV_y8Q","MR. BEAN VISITA EL DENTISTA","MR. BEAN VISITA EL DENTISTA (PART 2) | Vist a Youtube");
		addVideoItem("cOamt-Gl9m0","Mr been funny moment","Mr been funny moment watch video");
		addVideoItem("QL69u0cw3Os","Mr Bean Cox's Bazar","Mr Bean Cox's Bazar Full Episode Bangla Funny Dubbing 2021");
		addVideoItem("lg7zsT_LUS0","Mr Bean Sleeping Comedy","Mr Bean Sleeping Comedy Full Episode Bangla Funny Dubbing");
		addVideoItem("NQiH51SRXWw","Mr Bean Bangla","Mr Bean Bangla Funny Dubbing | Bangla Funny Video");
		addVideoItem("yHgLTGXY2So","The Department Store","The Department Store | Mr Bean Full Episodes | Mr Bean Official ");
		addVideoItem("568a0HDEn7w","Morning Bean","Morning Bean | Mr Bean Full Episodes | Mr Bean Official");
		addVideoItem("KpaDBUs8Ncc","Mr Bean","Mr Bean Funny! | Funny Clips | Mr Bean Official");
		addVideoItem("JPPqcl_4P5E","Strictly BEAN|","Mr Bean  (Try Not To Laugh!) | Funny Clips | Mr Bean Comedy");
		addVideoItem("vLKA3plTsHQ","Mr. Bean Strictly BEAN ","Mr Bean  (Try Not To Laugh!) | Funny Clips | Mr Bean Comedy");
		addVideoItem("WEBy5zrsdPI","Bean Food Fight!","Mr Bean Funny Clips | Mr Bean Official");
		addVideoItem("nONJU-c8ZQY","Teddy Hotel","Mr Bean Cartoon Season 1 | Full Episodes | Mr Bean Official");
		addVideoItem("P2BYM7PYdBk","Cash Machine ","Mr Bean | Cartoons for Kids | WildBrain Kids");
		addVideoItem("g2YQ6_55eFk","Mr Bean Cartoon: Episode 12 (Pizza Bean)"," Mr Bean Episode | Mister Bean Number 1 Fan in HD");
		addVideoItem("aRb0ycq_q9Q","Bean Cartoon","Long Compilation #328 ᐸ3 Mister Bean Number One Fan in HD");
		addVideoItem("du4DDUcC2gw","AIRPLANE Bean |Mr Bean  | Funny Clips","AIRPLANE Bean  Bean  Funny Clips Video");
		addVideoItem("QTli1HU9axY","Art DISASTER |Mr Bean  | Funny Clips","Art DISASTER  Bean Funny Clips Video");
		addVideoItem("D-qj0L68RhQ","Hair by Mr Bean of London |Mr bean","Hair by Mr Bean of London Funny Clips Video ");
		addVideoItem("tyAeM5kX9Z4","The HOTEL Trip (Try Not To Laugh) | Mr Bean ","The HOTEL Trip Try Not To Laugh Mr Bean Funny Clips Video  ");
		addVideoItem("vFDSWuffBcA","Operation Mr Bean | Funny Clips | Classic Mr. Bean","Operation Mr Bean Funny Clips video");
		addVideoItem("wBtFWKSCKZ4","Bean ARMY | Funny Clips | Mr Bean Comedy","Mr Bean ARMY Funny Clips video");
		addVideoItem("nTnzqzO7xR0","Die Wäsche waschen | Lustige Clips | Mr Bean Deutschland","Die Wäsche waschen Lustige Clips Mr Bean Deutschland video");
		addVideoItem("iVCt3OLPsFM","Mr Bean | Folge  | Mr Bean Deutschland","Mr Bean  Folge  Mr Bean Deutschland Funny Clips Video");
		addVideoItem("vLKA3plTsHQ","Strictly BEAN (Try Not To Laugh!) | Funny Clips | Mr Bean Comedy","Strictly BEAN Try Not To Laugh Funny Clips Mr Bean Comedy Funny Clips Video");
		addVideoItem("Bb90tC5UpQw","Mr Bean in 'Torvill and Bean' | Comic Relief ","Mr Bean in Torvill and Bean Comic Relief Funny Clips Video");
		addVideoItem("FPU2JICJ7nY","Fly Away BEAN | Mr Bean Full Episodes | Mr Bean Official","Fly Away BEAN Mr Bean Official Funny Clips Video ");
		addVideoItem("_Vx3lWoDJXY","Library BEAN | RARE episode | Mr Bean Official","Library BEAN RARE episode Mr Bean Official Funny Clips Video.");
		addVideoItem("yGqP54lv9q4","One Wedding and a Funeral | Funny Clip | Classic Mr Bean","One Wedding and a Funeral  Funny Clip Classic Mr Bean Funny Clips Video");
		addVideoItem("Ba9iJ7XZppU","Mr Bean - Treffen mit der Queen","Mr Bean  Treffen mit der Queen Funny Clips Video");
		addVideoItem("O_SsVfNfJBA","Mr. Bean - At The Dentist","Mr Bean At The Dentist Funny Clips Video");
		addVideoItem("OFj2qpIA_M0","Mr Bean in the hospital","Mr Bean in the hospital Funny Clips Video");
		addVideoItem("-uKOHJLs-mo","Fun and Games | Funny Compilation | Mr Bean Official","Fun and Games  Funny Compilation Mr Bean Official Videos");
		addVideoItem("2mSr6GgQV2Y","JUDO Bean | Funny Clips | Mr Bean Official","JUDO Bean Funny Clips Mr Bean Funny Clips Video");
		addVideoItem("LWxH844PHCA","How To DANCE The BEAN WAY | Mr Bean's Holiday | Classic Mr Bean","How To DANCE The BEAN WAY Mr Bean's Holiday Classic Mr Bean Funny Clips Video");
		addVideoItem("v6DY8cyOO1o","Mr Bean's European Car Journey | Mr Bean's Holiday | Mr Bean Official","Mr Bean's European Car Journey Mr Bean's Holiday Mr Bean  Funny Clips Video");
		addVideoItem("qLNhVC296YI","Mr Bean does 'Blind Date' | Comic Relief","Mr Bean does Blind Date Comic Relief Funny Clips Video");
		addVideoItem("JE2xJGU9gyc","BUSKING Bean | Mr Bean's Holiday | Funny Clips | Mr Bean Official", "BUSKING Bean Mr Bean's Holiday Funny Clips Video");
		addVideoItem("13FLawVtwSc","Bean ARRESTED | Bean Movie | Funny Clips | Mr Bean","Mr Bean ARRESTED the hospital Funny Clips Video");
		addVideoItem("LDmj_GOeRMU","Mr Bean in the hospital","Yes Sir Funny Clips Mr Bean the hospital Funny Clips Video");
		addVideoItem("OFj2qpIA_M0","Mr Bean in the hospital","Mr Bean in the hospital Funny Clips Video");
		addVideoItem("bYXOXw6-tm4","Mr Bean Animated","Mr Bean Ice Cream | Season 2 | Full Episodes | Cartoons for Children");
		addVideoItem("dqL9zNn2VDM","Mr Bean Animated","TAXI BEAN | Season 2 | Full Episodes Compilation | Cartoons for Children");
		addVideoItem("5bzCeeGQkY8"," Mr Bean Animated"," Парковка запрещена | Мультфильм для детей | Полный эпизод | WildBrain");
		addVideoItem("KehlqRhYTbI","Mr Bean | DOUBLE TROUBLE","Cartoon for kids | Mr Bean Cartoon | Full Episode | WildBrain");
		addVideoItem("Tb0UTT5pmgc","Mr Bean | EL SOFÁ ","Mr Bean Dibujos animados para niños | WildBrain");
		addVideoItem("O_SsVfNfJBA","Mr. Bean - At The Dentist","Mr Bean At The Dentist Funny Clips Video");
		addVideoItem("OFj2qpIA_M0","Mr Bean in the hospital","Mr Bean in the hospital Funny Clips Video");
		addVideoItem("-uKOHJLs-mo","Fun and Games | Funny Compilation | Mr Bean Official","Fun and Games  Funny Compilation Mr Bean Official Videos");
		addVideoItem("2mSr6GgQV2Y","JUDO Bean | Funny Clips | Mr Bean Official","JUDO Bean Funny Clips Mr Bean Funny Clips Video");
		addVideoItem("LWxH844PHCA","How To DANCE The BEAN WAY | Mr Bean's Holiday | Classic Mr Bean","How To DANCE The BEAN WAY Mr Bean's Holiday Classic Mr Bean Funny Clips Video");
		addVideoItem("v6DY8cyOO1o","Mr Bean's European Car Journey | Mr Bean's Holiday | Mr Bean Official","Mr Bean's European Car Journey Mr Bean's Holiday Mr Bean  Funny Clips Video");
		addVideoItem("qLNhVC296YI","Mr Bean does 'Blind Date' | Comic Relief","Mr Bean does Blind Date Comic Relief Funny Clips Video");
		addVideoItem("JE2xJGU9gyc","BUSKING Bean | Mr Bean's Holiday | Funny Clips | Mr Bean Official","BUSKING Bean Mr Bean's Holiday Funny Clips Video");
		addVideoItem("13FLawVtwSc","Bean ARRESTED | Bean Movie | Funny Clips | Mr Bean","Mr Bean ARRESTED the hospital Funny Clips Video");
		addVideoItem("LDmj_GOeRMU","Mr Bean in the hospital","Yes Sir Funny Clips Mr Bean the hospital Funny Clips Video");
		addVideoItem("OFj2qpIA_M0","Mr Bean in the hospital","Mr Bean in the hospital Funny Clips Video");
		addVideoItem("OFj2qpIA_M0","Mr Bean in the hospital","Mr Bean in the hospital Funny Clips Video");

		createPlayList("Mr.Been", R.drawable.category_4);
		//==========================================================================
		//--------------Charlie Chaplin----------------------->>>>>>
		//---------------------------------------------------->>>>>>
		//==========================================================================
		addVideoItem("AkLnj5pJtDI", "Charlie Chaplin Smuggled Nose Powder", "harlie Chaplin Smuggled Nose Powder funny video");
		addVideoItem("UwahG1s4dqI", "Charlie Chaplin Feeding Machine Modern Times", "Charlie Chaplin Feeding Machine Modern Times Funny Video");
		addVideoItem("Da05CRAZ97c", "Charlie Chaplin The Mechanic's Assistant", " Charlie Chaplin The Mechanic's Assistant Funny Video's");
		addVideoItem("Z7-QdoofMq8", "Charlie Chaplin The Kid Fight Scene Funny Video", "Charlie Chaplin The Kid Fight Scene Funny Video");
		addVideoItem("2mZ-v1TUwyE", "Charlie Chaplin County Orphan Asylum", "Charlie Chaplin County Orphan Asylum Rooftop Chase from The Kid");
		addVideoItem("UY7GovG_w1c", "Charlie Chaplin The Kid Working the Streets ", "Charlie Chaplin The Kid Working the Streets");
		addVideoItem("_Cfr7iv78o4", "Charlie Chaplin on the tightrope The Circus", "Charlie Chaplin on the tightrope The Circus");
		addVideoItem("xBjk18ggIcI", "Charlie Chaplin Hotel Evergreen ", "Charlie Chaplin - Hotel Evergreen from Sunnyside");
		addVideoItem("kPcEFHA3X0c", "Charlie Chaplin Modern Times", "Charlie Chaplin Modern Times Roller Skating Scene");
		addVideoItem("qaOwk4AQilA", "Charlie Chaplin with spoiled brat", "Charlie Chaplin with spoiled brat - Clip from The Pilgrim");
		addVideoItem("IhmmoyxD8As", "Lunch time with Charlie Chaplin", "Lunch time with Charlie Chaplin - Clip from Pay Day");
		addVideoItem("dnlyIIMrZuk", "Charlie Chaplin and his brother Sydney", "Charlie Chaplin and his brother Sydney in a scene from A Dog's Life");
		addVideoItem("q5zmXWwBU18", "Charlie Chaplin saves Scraps from a wild pack of dogs", "Charlie Chaplin saves Scraps from a wild pack of dogs from dog's life");
		addVideoItem("G8oY_lHYszI", "Charlie Chaplin City Lights", "Charlie Chaplin - City Lights - Party Scene");
		addVideoItem("wBIov_CSqyI", "Charles Chaplin TIempos Modernos", "Charles Chaplin TIempos Modernos Funny Video");
		addVideoItem("0daS_SDCT_U", "Chaplin Modern Times Funny Video", "Chaplin Modern Times non-sense Video");
		addVideoItem("I0LFhwXXmfc", "charli chaplin comedy video best perfermenc", "charli chaplin comedy video best perfermence charli chaplin in my view");
		addVideoItem("YmnEjqJPwqE", "卓别林 ", "In this video, you will discover the strangest funny charli chaplin");
		addVideoItem("Y-7ntsRgi7M", "Charlie Chaplin World War Funny Video", "Charlie Chaplin World War Funny Video");
		addVideoItem("o9NfXIXzgnA", "Charlie Chaplin Boxing Match Funny Video", "Charlie Chaplin Boxing Match Funny Video's");
		createPlayList("Charlie Chaplin", R.drawable.category_5);



		addVideoItem("aLtc5PbIvwg", "3 Stooges Bangla", "3 Stooges Bangla Dubbing Original 1080p Full Video");
		addVideoItem("-Qqd1_myfwY", "3 Stooges Bangla ", "3 Stooges Bangla Dubbing Original 1080p তিন রংমিস্ত্রির কান্ড");
		addVideoItem("poICtQW_d_0", "Three Stooges Painter", "Bangla Funny Dubbing | Bangla Funny Video ");
		addVideoItem("aqarN-ShNho", "Three Stooges Car Mesturi", "Bangla Funny Dubbing  Bangla Funny Video");
		addVideoItem("JXqJZHzBUug", "Three stooges ", "Three stooges now Broiler chickens eat _ তিন বলদ ব্রয়লার কিনে খয়রাতি _ funny video");
		addVideoItem("HAHR9xN8n78", "Three Stooges Rural Electricity Men  ", "Bangla Funny Dubbing  Bangla Funny Video ");
		addVideoItem("TEskSC2kjek", "Three Stooges Black VS White War", "Bangla Funny Dubbing | Bangla Funny Video ");
		addVideoItem("aLtc5PbIvwg", "3 Stooges Bangla Dubbing Original Video", "Original Audio Video ");
		addVideoItem("-Qqd1_myfwY", "3 Stooges Bangla Dubbing Original ", "3 Stooges Bangla Dubbing Original fani video");
		addVideoItem("resNDkOTa2U", "Bangla Funny Dubbing | Bangla Funny Video", " Bangla Funny Dubbing  Bangla Funny Video");
		addVideoItem("AkLnj5pJtDI", "Charlie Chaplin Smuggled Nose Powder", "Charlie Chaplin Smuggled Nose Powder fani video"); addVideoItem("UwahG1s4dqI", "Charlie Chaplin Feeding Machine ", "A classic scene from Modern Times ");
		addVideoItem("o9NfXIXzgnA", "Charlie Chaplin - Boxing Match", "A classic scene from City Lights in which Charlie Chaplin ends up in a boxing match with a prizefighter (Hank Mann)");
		addVideoItem("Z7-QdoofMq8", "Charlie Chaplin - The Kid - Fight Scene", " A classic scene from The Kid with Charlie Chaplin and Jackie Coogan");
		addVideoItem("_0a998z_G4g", "Charlie Chaplin - The Lion Cage", "The Circus soundtrack");
		addVideoItem("Da05CRAZ97c", "Charlie Chaplin - The Mechanic's Assistant", "Charlie Chaplin and Chester Conklin in a scene from Modern Times ");
		addVideoItem("v8-flkIY1SI", "Charlie Chaplin - The Circus", "Tribute to the great Charlie Chaplin");
		addVideoItem("riJVkkr0bvGI", "Charlie Chaplin - The Circus", " Charlie Chaplin (សាក់ឡូ) - The Circus");
		addVideoItem("r5taVI9BkRY", "Charlie Chaplin - The Circus ", "Charlie Chaplin (សាក់ឡូ) - The Circus");
		addVideoItem("v6mU1DQnc5Q", "Three Stooges Mota Mathar Toothache", "Bangla Funny Dubbing Bangla Funny Video ");
		createPlayList("Three Stooges", R.drawable.category_6   );

		//==========================================================================
		addVideoItem("MUMCZZl9QCY", "Oggy and the Cockroaches ", " Oggy and the Cockroaches  KEYS & IDEAS  Hindi Cartoons for Kids");
		addVideoItem("WMfbrmup1XU", "Oggy and the Cockroaches ", "From Mumbai With Love (s04e74) Full Episode in HD");
		addVideoItem("594ITLAyL1o", "Oggy and the Cockroaches ", "Oggy Goes Green (S04E32) - Hindi Cartoons for Kids");
		addVideoItem("dKw7bdk6hQ8", "Oggy and the Cockroaches", "Oggy Goes Green (S04E32) - Hindi Cartoons for Kids");
		addVideoItem("lnMi9hkMkqY", "हिंदी Oggy and the Cockroaches", " PEEL POTATOES Hindi Cartoons for Kids");
		addVideoItem("Pj1eq6Opj7g", "Oggy et les Cafards", "Bonhomme de Neige (S04e65) Episode complet en HD ");
		addVideoItem("PTbbaoKfMRU", "Oggy et les cafards ", "La course de baignoires  (S04EP36) | Episodes complets en HD");
		addVideoItem("YLQl-yUSjx8", "Oggy and the Cockroaches ", "I SEE YOU  Hindi Cartoons for Kids");
		addVideoItem("s-9eYceu6ZA", " Oggy and the Cockroaches ", " Globulopolis (S01E33) - Hindi Cartoons for Kids");
		addVideoItem("01CxHBF0XyU", "Oggy and the Cockroaches ", "Oggy’s Double (S03E34) - Hindi Cartoons for Kids");
		addVideoItem("ncX65jSzjaY", "Oggy and the Cockroaches  ", "Do you want some caviar?  Full Episode in HD ");
		addVideoItem(" U_Hyd9_b_Xw", "Oggy and the Cockroaches ", "Joey and the Magic Bean (S02E136) - Hindi Cartoons for Kids ");
		addVideoItem("gpuPhuv9Crs", "Oggy and the Cockroaches", "DOODLE OGGY  Hindi Cartoons for Kids");
		createPlayList("Oggy and Cockroaches", R.drawable.category_7);
		//==========================================================================


		//----------Tom And Jerry------------------------------------------------------
		//=========================================================================
		addVideoItem("--P7h3qTyBE", "Tom and Jerry", "Tom and Jerry Bangla | cartoon | Tom and Jerry cartoon | Bangla Tom and Jerry");
		addVideoItem("FOppps0Vz_Q", "Tom et Jerry en Français", "Aventures de poissons  | WBKids");
		addVideoItem("I4qdYeEo49c", "Tom and Jerry cartoon video", "kids cartoon video 2023");
		addVideoItem("xThek6O4D1Q", "Том и Джерри", "Классический мультфильм 26 | WB Kids ");
		addVideoItem("PS_O5paaVNc", "Tom and jerry bangla", "জেরি ইঁদুরের জুলুম-অত্যাচার || অসহায় টম || শেষ পর্ব");
		addVideoItem("HGUQUUzJNdM", "Tom y Jerry en Latino ", "El monstruoso Jerry | WB Kids");
		addVideoItem("GySdjmTgkqA", "Tom y Jerry en Latino", " ¿Está Jerry Cuidando a Tom? | WB Kids");
		addVideoItem("xQjT_ChsJBw", "Tom & Jerry in italiano", "Tom il gatto o Tom l'uccello | WB Kids");
		addVideoItem("dVNBWvmRqpE", "Tom & Jerry", "Trapping Jerry | Classic Cartoon | WB Kids");
		addVideoItem("Lvd7zQtKS74", "Tom & Jerry", "Best of Jerry and Little Quacker | Classic Cartoon Compilation | WB Kids");
		addVideoItem("snvzakfcTmY", "Tom & Jerry em Português ", "Brasil | O melhor de Patinho | WB Kids");
		addVideoItem("tyZ_d0TAFv0", "Tom & Jerry em Português ", "Brasil | Pegue-me se for capaz | WB Kids");
		addVideoItem("vBm_LhIlNhY", "Том и Джерри", "Всё обман | WB Kids");
		addVideoItem("cqyziA30whE", "Tom & Jerry | Best Buddies", "Classic Cartoon Compilation | WB Kids");
		addVideoItem("Wvz-6ic7MYU", "Tom & Jerry in italiano", " U-u-u-uccellino! | WB Kids");
		addVideoItem("64DUWAFw6uM", "Tom und Jerry auf Deutsch", "Klassischer Cartoon 105 | WB Kids");
		addVideoItem("qeeDhADAU4Q", "Tom & Jerry", "Buddies for Life | Classic Cartoon Compilation | WB Kids");
		addVideoItem("o_n_Y3YmQWU", "Tom y Jerry en Latino ", "Grandes aventuras con Tom y Jerry | WB Kids");
		addVideoItem("kgYNNiCQlKc", "Том и Джерри ", " Летняя Олимпиада | WB Kids");
		addVideoItem("mP0s5s0i20E", "The Tom and Jerry Show", "Tom The Gym Cat | Boomerang UK 🇬🇧");
		addVideoItem("04uYwOd-xtA", "Tom și Jerry", "Șobolan polițist | Cartoonito");
		addVideoItem("-0kL15EMNkA", "Tom și Jerry", "Robotul protector | Cartoonito");
		addVideoItem("Dn_86JWCs5c", "Tom i Jerry Show", "  Wędkowanie | Cartoonito");
		addVideoItem("SYN9Sngo1qU", "Tom i Jerry", " Zabawa z balonami | Cartoonito");
		addVideoItem("drXAfqQdaYo", "Tom en Jerry Show", "Holenkat | Cartoonito");
		createPlayList("Tom And Jery", R.drawable.category_8);
//------------------------------------------------------












	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

