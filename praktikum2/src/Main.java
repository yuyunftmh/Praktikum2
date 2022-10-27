public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        // Person Anton
        person.setName("Anton");
        person.setJenisKelamin("Laki-Laki");
        person.setUmur(23);
        System.out.println("Nama: " + person.getName());
        System.out.println("Jenis Kelamin: " + person.getJenisKelamin());
        System.out.println("Umur: " + person.getUmur());

        // Person Riko
        person1.setName("Riko");
        person1.setJenisKelamin("Laki-Laki");
        person1.setUmur(17);
        System.out.println("Nama: " + person1.getName());
        System.out.println("Jenis Kelamin: " + person1.getJenisKelamin());
        System.out.println("Umur: " + person1.getUmur());
    }
}