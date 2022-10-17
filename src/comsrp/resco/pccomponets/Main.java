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

        TarjetaGrafica DD = new TarjetaGrafica();

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

        TarjetaGrafica nvidia = new TarjetaGrafica();

        nvidia.setId(1);
        nvidia.setMarca("RTX 3060");
        nvidia.setFabricante("NVIDIA");

        System.out.println(nvidia.getId());
        System.out.println(nvidia.getMarca());
        System.out.println(nvidia.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        TarjetaGrafica nvidia = new TarjetaGrafica();

        nvidia.setId(1);
        nvidia.setMarca("RTX 3060");
        nvidia.setFabricante("NVIDIA");

        System.out.println(nvidia.getId());
        System.out.println(nvidia.getMarca());
        System.out.println(nvidia.getFabricante());

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        TarjetaGrafica nvidia = new TarjetaGrafica();

        nvidia.setId(1);
        nvidia.setMarca("RTX 3060");
        nvidia.setFabricante("NVIDIA");

        System.out.println(nvidia.getId());
        System.out.println(nvidia.getMarca());
        System.out.println(nvidia.getFabricante());
    }
}
