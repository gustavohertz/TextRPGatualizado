
// class that don't do anything but storing methods to print out every part of the story
public class Story {
    public static void printIntro() {
        System.out.println("STORY");
        System.out.println("Você é o último de pé depois que a sua vila foi saqueada pelos homens do imperador.");
        System.out.println("Todos que você conhecia, amigos, família e vizinhos, foram assassinados.");
        System.out.println("Você olha para essa vila que já foi feliz.");
        System.out.println("Agora você quer vingança, deseja matar o imperador e libertar o país.");
        GameLogic.anythigToContinue();
    }

    public static void printFirstActIntro() {
        System.out.println("ATO-1 INTRO");
        System.out.println("Sua jornada começa viajando por florestas próximas para chegar nas Montanhas Eternas.");
        System.out.println("Montanhas essas que ninguém nunca voltou vivo.");
        System.out.println("Depois de uma longa caminhada, você chega lá.");
        System.out.println("Você não se importa se é perigoso.");
        GameLogic.anythigToContinue();
    }

    public static void printFirstActOutro() {
        System.out.println("ATO-1 OUTRO");
        System.out.println("Você enfrentou desafios incríveis nas Montanhas Eternas.");
        System.out.println("Encontrou um grupo de rebeldes que o ajudou a treinar suas habilidades.");
        System.out.println("Agora, você está mais preparado para continuar sua jornada.");
        GameLogic.anythigToContinue();
    }

    public static void printSecondActIntro() {
        System.out.println("ATO-2 INTRO");
        System.out.println("Você chega à Cidade Capital, o coração do império do imperador.");
        System.out.println("Aqui, a opressão é sentida em todos os cantos.");
        System.out.println("Você precisa encontrar aliados e um plano para derrotar o imperador.");
        GameLogic.anythigToContinue();
    }

    public static void printSecondActOutro() {
        System.out.println("ATO-2 OUTRO");
        System.out.println("Depois de inúmeras batalhas e alianças improváveis,");
        System.out.println("você está mais perto de seu objetivo.");
        System.out.println("Mas o imperador ainda está lá, e a batalha final se aproxima.");
        GameLogic.anythigToContinue();
    }

    public static void printThirdActIntro() {
        System.out.println("ATO-3 INTRO");
        System.out.println("Chegou o momento da batalha final.");
        System.out.println("Você e seus aliados marcham para o palácio do imperador.");
        System.out.println("A esperança do país está em suas mãos.");
        GameLogic.anythigToContinue();
    }

    public static void printThirdActOutro() {
        System.out.println("ATO-3 OUTRO");
        System.out.println("Você derrotou o imperador e libertou o país da opressão.");
        System.out.println("A paz finalmente retorna à terra, graças a sua coragem e determinação.");
        GameLogic.anythigToContinue();
    }

}
