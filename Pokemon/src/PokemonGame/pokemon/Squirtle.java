package PokemonGame.pokemon;

import PokemonGame.Attack;
import PokemonGame.NormalSkill;
import PokemonGame.Pokemon;
import PokemonGame.WaterSkill;

public class Squirtle extends Pokemon implements NormalSkill, WaterSkill{
	
	public Squirtle(String pokeName, String pokeType, int pokeLevel, int pokeTotalHP, int pokeHP, int pokePhysicDamage, int pokePhysicDefense,
			int pokeMagicDamage, int pokeMagicDefense) {
		super(pokeName, pokeType, pokeLevel, pokeTotalHP, pokeHP, pokePhysicDamage, pokePhysicDefense, pokeMagicDamage, pokeMagicDefense);
	}

	public void Defense(Attack attack) {
		if(attack.attackType == "Water") {
			this.pokeHP = pokeHP + (pokePhysicDefense - (2 * attack.attackValue));
			System.out.println("Squirtle is attacked!");
			System.out.println("It's super effective!");
			System.out.println("HP : " + pokeHP);
		} else {
			this.pokeHP = pokeHP + (pokePhysicDefense - attack.attackValue);
			System.out.println("Squirtle is attacked!");
			System.out.println("HP : " + pokeHP);
		}
	}
	public Attack Tackle(int damage) {
		System.out.println("Squirtle's Tackle!");
		int attackDamage = damage;
		String attackType = "Normal";
		return new Attack(attackDamage, attackType);
	}
	public Attack WaterGun(int damage) {
		System.out.println("Squirtle's WaterGun!");
		int attackDamage = damage + 3;
		String attackType = "Water";
		return new Attack(attackDamage, attackType);
	}
}