package ch.puleio.occurences;

import java.util.Scanner;

/**
 * 
 * @author Licya
 * Creation 	:	19th of June 2014
 * Last Update	:	19th of June 2014
 * Description	:
 *
 */

/*
 * La situation
Une des règles de base pour qu’un référencement de pages Web fournisse des
résultats intéressants lors d’une recherche via un moteur de recherche consiste à
s’assurer que des mots-clés, introduits dans l’en-tête des pages Web, soient utilisés
dans le contenu de la page Web.

Vos tâches
1. Ecrire un programme Java qui permet de calculer la fréquence d’apparition de mots 
donnés dans un texte. Le programme fonctionnera de la manière simplifiée
suivante :
a. Une chaîne de caractères est saisie avec plusieurs mots séparés par des 
virgules.
b. Une seconde chaîne est saisie et représente le contenu de la page Web.
c. Votre programme va ensuite calculer et afficher le nombre d’apparitions de 
chaque mot de la 1
ère
 chaîne dans le texte.
 
Exemple :
a. 1ère chaine : « règle, chaîne, programme, moteur, mots ».
b. 2ème chaîne : énoncé de cet exercice jusqu’à cet exemple. 
 */
public class NumberOfOccurences 
{
	
	
	public static void main(String[] args) 
	{
		String s1, s2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input various keywords : ");
		s1 = scan.nextLine();
		
		System.out.println("In put a text : ");
		s2 = scan.nextLine();
		
		Occurences s = new Occurences(s1 , s2);
		
		s.insterIntoTalbe();
		s.calculateOccurences();
		System.out.println(s.toString());
	}

}
