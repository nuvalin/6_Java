package book4.chapter6;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Spell {
    public String name;


    public SpellType type;
    public String description;
    public int price;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String name, SpellType type, String description, int price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Spell {" +
                "name='" + name + '\'' +
                ",type=" + type +
                ",description='" + description + '\'' +
                ",price='" + price + '\'' +
                '}';


    }

    public static void main(String[] args) {

        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
                "Makes invisible ink appear.", 10));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
                "Launches birds from your wand.", 20));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
                "Enlarges something.", 100));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
                "Hides a secret within someone.", 30));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
                "Stops all current spells.", 40));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
                "Locks an opponent's legs.", 50));
//        for (Spell spell: spells){
//            System.out.println(spell.name);
//        }
        //spells.stream().forEach(s -> System.out.println(s));
//        for (Spell spell : spells) {
//            if (spell.type == Spell.SpellType.SPELL)
//                System.out.println(spell);
//        }

//        spells.stream()
//                .filter(s -> s.type == Spell.SpellType.SPELL)
//                .forEach(s -> System.out.println(s));

        // double total = spells.parallelStream()
        // .filter(s -> s.type == Spell.SpellType.SPELL)
        // .filter(s -> s.name.toLowerCase().startsWith("a"))
//                .mapToDouble(s -> s.price)
//                .sum();
//        System.out.println("TOTAL IS " + total);
//        OptionalDouble avg = spells.stream()
//                .mapToDouble(s -> s.price)
//                .average();
//        if (avg.isPresent()) {
//            System.out.println("Average is " + avg.getAsDouble());
  //      }
        System.out.println("First Parallel stream: ");

        spells.parallelStream().forEach(s -> System.out.println(s));

        System.out.println("Second Parallel stream: ");

        spells.parallelStream().forEach(s -> System.out.println(s));
        System.out.println("Third Parallel stream: ");

        spells.parallelStream().forEach(s -> System.out.println(s));
    }
}