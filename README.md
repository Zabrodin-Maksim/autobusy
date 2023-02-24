# autobusy
Z místa A do místa B jezdí autobusy různými trasami s různou délkou.

### Třída Čas

atributy: 

  • int hodina
  
  • int minuty

metody:

• parametrický konstruktor

• přetížený toString()

• int převeďNaMinuty()

o vrátí počet minut od půlnoci 0:00

• int spočítejRozdílMinuty(Čas čas)

o spočítá rozdíl dvou časů v minutách

### Třída Spoj

atributy:

• String id

• Čas časVýjezdu

• Čas časDojezdu

metody:

• parametrický konstruktor, gettery, settery, přetížený toString()

• int časJízdyMinuty()

o vypočítá čas jízdy spoje v minutách, využijte metodu spočítejRozdílMinuty()

### Třída Statistiky
atributy:

• pole/seznam spojů spoje (a další podle uvážení)

metody:

• konstruktor dle uvážení

• void přidejSpoj(Spoj spoj)

o přidá spoj do pole/seznamu

• void vypišSpoje()

o vypíše všechny spoje z pole/seznamu

• Spoj najdiNejrychlejšíSpoj()

o nalezne spoj s nejrychlejším projetím trasy

o využijte metodu časJízdyMinuty()

• void vypišSpojeOdČasu(Čas čas)

o vypíše spoje s odjezdem po zadaném času

• void načtiSpoje(String jménoSouboru)

o načte ze souboru spoje do pole/seznam
