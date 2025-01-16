package com.lottery.structuretype.flyweight;

import java.util.Hashtable;

public class CharactorFactory {

    // Fields
    private Hashtable charactors = new Hashtable();

    // Method
    public Charactor GetCharactor(String key)    {
        Charactor charactor = (Charactor) charactors.get(key);

        if (charactor == null)        {
            switch (key)            {
                case "A": charactor = new CharactorA(); break;
                case "B": charactor = new CharactorB(); break;
                case "C": charactor = new CharactorC(); break;
                //
            }
            charactors.put(key, charactor);
        }
        return charactor;
    }

}
