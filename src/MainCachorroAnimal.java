public class MainCachorroAnimal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", 5, "Uau, Uau ..","Labrador");

        System.out.println(cachorro);

        cachorro.fazerSom();

        //Fazendo Cast de Cachorro para Animal
        Animal cachoroCast = (Animal) cachorro;

        // Verificação usando instanceof
        if (cachoroCast instanceof Animal) {
            System.out.println(cachoroCast);

            cachoroCast.fazerSom();

            cachoroCast.comer();
        }






    }
}
