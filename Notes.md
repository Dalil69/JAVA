JAVA :
-Langage système simple, orienté Objet et interprété,

- optimisation du temps des cycles de dev.(compilation et exécution)

- Les applications produites sont portables cross platform.

- Par rapport au C++ gestion de la mémoire et des erreurs sont simplifiées.

- Il est possible de créer des applications

multi threadés

- Les applications sont très robustes et sécurisées grâce à des vérifications du

bytecode avant exécution.



La plateforme JAVA

• JDK : Java Dev Kit

• API

• javac : le compilateur java

• JRE (Java runtime env) : l'environnement d'exécution installe sur la machine cliente. Il

propose notamment l'outil Java qui permet d'exécuter les programmes java.

• JVM (Java Virtual machine): permet l'exécution du programme passe en param. de la

commande java



La machine virtuelle Java

Elle est mise à disposition pour de multiples OS.

Ses roles sont multiples:

• elle charge des classes (et leur bytecode), a l'instanciation d'une classe c'est elle qui

charge le bytecode à interpréter



• elle gère la mémoire:

les pointeurs et les références. Elle gère aussi la libération de la mémoire :

Collector

• Elle gère aussi la sécurité

• interfaçage avec du code natif

L'API JAVA

Ensemble de logiciels pre conçu pour fournir un grand nombre de fonctionnalités.

L'API Java 17 :

• 21 modules

• 220 packages (l'équivalent des bibliothèques de classes en C# ou des librairies en

langage C)

• Plus de 4000 classes et interfaces mises a disposition

Deux implémentations pour une plateforme

• Oracle JDK

• OpenJDK

Il est recommandé d'ajouter JAVA_HOME en tant que variable d'environnement

C :\User\Dev\Desktop\Java\ jdk—17. 0. 2

Ensuite vous modifiez la variable d'environnement PATH avec l'entrée:

…;%JAVA_HOME%\bin



Votre premier programme en JAVA

un programme java est une collection de fichiers java destinés

à fonctionner ensemble.





Il faut plusieurs étapes pour l'exécution d' un

programme JAVA :

compilation: code source (en java) ->

bytecode (langage intermédiaire) . Le bytecode

n'est pas du binaire

C'est la JVM qui charge le bytecode et le compile à la volée (JIT : just in time) pour exécuter du code qui sera compréhensible par la machine hôte

### Les variables en java

instance de classe : l'objet créé à partir d'une

classe

Les categories de variables:

Variables d'instance  n'existe que si

une instance de classe est disponible. Chaque

instance possède sa propre version de la variable

variables de elles sont aussi

déclarées a intérieur d'une classe mais avec

le mot clé static

La variable de classe est

disponible directement depuis la classe et

existe en un exemplaire unique. On peut avoir 50

instances d'une même classe, mais la valeur

d'une variable de classe est unique.



instances d'une meme classe, mais la valeur d'une

variable de classe est unique.

• les variables locales sont déclarées a l'interieur d'une

methode

La nomenclature des variables:

• le nom d'une variable commence par une lettre

• lettres, chiffres et underscore

• nombre illimité de caractères

• case Sensitive / sensible a la casse

• keywords

• camel case: le nom commence par une minuscule et

chaque nouveau mot commence par une maj.

Les types de variables :

On distingue deux types de variables:

• Les types valeurs : celles qui stockent des valeurs

• les types references : celles qui ne stockent pas

reelleement de valeur



Les constantes

Il arrive que des variables ne doivent pas être modifiées au

cours de l'exécution du programme: il convient alors de définir

des constantes

Pour définir une constante on utilise le mot clé final

final double PI= 3, 141592653589793238462643383279

L'initialisation de la constante est obligatoire lors de sa

déclaration.

Souvent les constantes sont définies comme membres

statiques.

Par convention on les écrit en majuscules.

Les enumerations :

Elles permettent de definir un ensemble de constantes :

public enum Month

{

JANVIER,

FEVRIER,

MARS,

AVRIL

MAI,

JUIN,

JUILLET,

AOUT,

SEPTEMBRE,

OCTOBRE ,

NOVEMBRE,

DECEMBRE
}



L'equivalent avec une classe :



public class Month

{

public static final int JANVIER

}

La déclaration d'une enum peut être considère

commue l'utilisation d'une "classe cachee•. Cette

classe herite de java. lang. Enum



On peut acceder aux elements d'un tableau de cette manier

java

autreSyntaxe [41 ;

Si vous tentez d'acceder a un index inexistant vous allez

obtenir une exception de type :

`ArrayIndexOutOfBoundException`

Il est possible de travailler avec des tableaux a

plusieurs dimensions :



La syntaxe pour recuperer des elements dans un tableau a

2D est la suivante:



Int elemTab1eau2D = tableau2D[0][1];



Creez un tableaux contenant IO String Jet

remplir ce tableau avec des adresses mail,

exemple

"jpp@sfr.fr"•

"tom@gmai1.corn" ;

" f red@Sfr. fro •

"victoresfr. fr";

"chrisesfr.fr"•

" robert@orange.fr" •

"paul@sfr. fr•• ;

lise@gmail.com•• ;

"thierry@isitech.fr" ;

"marie€isitech. fr" ;

Calculez le pourcentage de fournisseurs de

services mail.

(pour une adresse @gmail.com le fournisseur est

gmail).



Consultez la javadoc :

• String :

https://docs.oracle.com/en/java/javase/17/do

cs/api/java.base/java/lang/String.htmI 