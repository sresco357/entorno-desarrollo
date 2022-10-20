package comsrp.resco.pccomponets;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Procesador amd = new Procesador();

        amd.setId(1);
        amd.setMarca("Ryzen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("Intel");

        System.out.println(pentium.getId());
        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de placas base.
         */

        PlacaBase motherboard = new PlacaBase();

        motherboard.setId(1);
        motherboard.setMarca("H81M-VG4 R2.0");
        motherboard.setFabricante("ASRock");

        System.out.println(motherboard.getId());
        System.out.println(motherboard.getMarca());
        System.out.println(motherboard.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        TarjetaGrafica nvidida = new TarjetaGrafica();

        nvidida.setId(1);
        nvidida.setMarca("RTX 3060");
        nvidida.setFabricante("NVIDIA");

        System.out.println(nvidida.getId());
        System.out.println(nvidida.getMarca());
        System.out.println(nvidida.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        RAM corsair = new RAM();

        corsair.setId(1);
        corsair.setMarca("Vengeance LED");
        corsair.setFabricante("Corsair");

        System.out.println(corsair.getId());
        System.out.println(corsair.getMarca());
        System.out.println(corsair.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        DiscoDuro DD = new DiscoDuro();

        DD.setId(1);
        DD.setMarca("RTX 3060");
        DD.setFabricante("NVIDIA");

        System.out.println(DD.getId());
        System.out.println(DD.getMarca());
        System.out.println(DD.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        FuenteAlimentacion FA = new FuenteAlimentacion();

        FA.setId(1);
        FA.setMarca("LUX 550W");
        FA.setFabricante("Aerocool ");

        System.out.println(FA.getId());
        System.out.println(FA.getMarca());
        System.out.println(FA.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Ventilador ven = new Ventilador();

        ven.setId(1);
        ven.setMarca("RTX 3060");
        ven.setFabricante("NVIDIA");

        System.out.println(ven.getId());
        System.out.println(ven.getMarca());
        System.out.println(ven.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Monitor mon = new Monitor();

        mon.setId(1);
        mon.setMarca("RTX 3060");
        mon.setFabricante("NVIDIA");

        System.out.println(mon.getId());
        System.out.println(mon.getMarca());
        System.out.println(mon.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Grabadora Gra = new Grabadora();

        Gra.setId(1);
        Gra.setMarca("RTX 3060");
        Gra.setFabricante("NVIDIA");

        System.out.println(Gra.getId());
        System.out.println(Gra.getMarca());
        System.out.println(Gra.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Teclado Tec = new Teclado();

        Tec.setId(1);
        Tec.setMarca("RTX 3060");
        Tec.setFabricante("NVIDIA");

        System.out.println(Tec.getId());
        System.out.println(Tec.getMarca());
        System.out.println(Tec.getFabricante());
        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        TarjetaSonido TS = new TarjetaSonido();

        TS.setId(1);
        TS.setMarca("RTX 3060");
        TS.setFabricante("NVIDIA");

        System.out.println(TS.getId());
        System.out.println(TS.getMarca());
        System.out.println(TS.getFabricante());
        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Raton Rat = new Raton();

        Rat.setId(1);
        Rat.setMarca("RTX 3060");
        Rat.setFabricante("NVIDIA");

        System.out.println(Rat.getId());
        System.out.println(Rat.getMarca());
        System.out.println(Rat.getFabricante());
        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Altavoces Alt = new Altavoces();

        Alt.setId(1);
        Alt.setMarca("RTX 3060");
        Alt.setFabricante("NVIDIA");

        System.out.println(Alt.getId());
        System.out.println(Alt.getMarca());
        System.out.println(Alt.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        CajaTorre CT = new CajaTorre();

        CT.setId(1);
        CT.setMarca("RTX 3060");
        CT.setFabricante("NVIDIA");

        System.out.println(CT.getId());
        System.out.println(CT.getMarca());
        System.out.println(CT.getFabricante());


    }
}
