package ch.puleio.restaurant;

import java.util.Scanner;

/**
 * 
 * @author Licya
 * Created		:	18th of June 2014
 * Last update	:	18th of June 2014
 */

/*
 * Description :
 * Un restaurant est rempli de tables de différentes tailles. Lorsque des clients arrivent au
 * restaurant, le nombre de personnes est demandé. S’il y a une table assez grande de
 * libre, ils peuvent s’asseoir à cette table. Cette table est alors occupée. 
 * 
 * Votre tâche consiste à écrire un programme qui gère les tables d’un restaurant. 
 * Pour ce faire vous allez réaliser les tâches suivantes : 
 * 
 * a. Créer une classe Table. La classe doit gérer le nombre de chaises d’une table, le
 * statut (« occupé » ou « libre ») et le numéro de la table (numéro unique).
 * Implémenter également un constructeur avec des paramètres, des getters et des
 * setters ainsi qu’une méthode toString() qui retourne les informations sur la classe
 * sous forme de string. Initialement, le statut est toujours « libre ». 
 * 
 * b. Implémenter un deuxième constructeur qui fixe le nombre des chaises à 4.
 * 
 * c. Implémenter une classe Restaurant qui contient une fonction main() pour simuler un restaurant. 
 * Au début, demander le nombre de tables et le nombre de chaises pour chaque table. Gérer les tables dans un tableau. 
 * 
 * d. Créer dans la classe de test, un menu avec les options suivantes : « s’asseoir »,
 * « partir », « afficher », « fin ». Les options sont détaillées ci-après : 
 * 
 * e. Option « s’asseoir » : Attribuer une table libre aux clients qui viennent d’arriver
 * (l’utilisateur indique toujours le nombre de personnes). Toujours attribuer la
 * première table disponible pour le nombre de personnes requises. La table a alors le statut « occupée ». 
 * 
 * f. Option « partir » : Le numéro de la table est indiqué et le statut de la table passe à « libre ». 
 * 
 * g. Option « afficher » : Afficher les informations sur toutes les tables gérées.
 * 
 * h. Si un client veut partir d’une table qui n’est pas disponible dans le restaurant, un message d’erreur doit être affiché. 
 */

public class TestRestaurant 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int answer;
		
		System.out.println("Thank you for choosing our restaurant management program.");
		System.out.println("For begining press 1, for exiting press 0, any other pressed key will make the program exiting");
		
		answer = scan.nextInt();
		
		if(answer == 1)
		{
			Gestion g = new Gestion();
		}
		
		if(answer == 0)
		{
			System.exit(0);
		}
		
		else
		{
			System.exit(0);
		}
	
	}

}
