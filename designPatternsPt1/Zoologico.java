package designPatternsPt1;

 class Zoologico {
        private static Zoologico instancia;

        private String nome;

        private Zoologico() {
            nome = "Zoológico Central";
        }

        public static Zoologico getInstancia() {
            if (instancia == null) {
                instancia = new Zoologico();
            }
            return instancia;
        }

        public String getNome() {
            return nome;
        }
    }

