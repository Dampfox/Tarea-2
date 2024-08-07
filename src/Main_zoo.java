public class Main_zoo {

        public static void main(String[] args) {
            Perro miPerro = new Perro("Boby", 5);
            Gato miGato = new Gato("Luna", 3);

            miPerro.hacerSonido();
            miPerro.comer();
            miPerro.beber();
            miPerro.dormir();
            miPerro.hacerTruco();
            miPerro.hacerTruco("dar la pata");

            miGato.hacerSonido();
            miGato.comer();
            miGato.beber();
            miGato.dormir();
        }
}
