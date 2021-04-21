import random

#Jono -tietotyyppi
class Jono:

    def __init__(self):
        #Luodaan lista
        self.lista = [] #taulukko

    def lisaa(self,tieto):
        #Lisätään alkio oikeaan kohtaan
        print("Lisätään jonoon luku " +str(tieto))    
        self.lista.append(tieto)
        

    def poistaSeuraava(self):
        # palauttaa jonon seuraavan alkion ja  poistaa sen listasta.
        t = self.lista[0]
        self.lista.pop(0)
        print ("" +" Jonosta poistetaan " +str(t))
        return t


    def tulosta(self):
        #Tulostetaan
        print(self.lista)
        print("")

#pino - tietotyyppi
class Pino:

    def __init__(self):
        #Luodaan lista
        self.lista = [] #taulukko

    def lisaa(self,tieto):
        #Lisätään alkio oikeaan kohtaan
        print("Lisätään Pinoon " +str(tieto))

        self.lista.insert(len(self.lista)-1,tieto)

    def poistaSeuraava(self):
        # palauttaa jonon seuraavan alkion ja  poistaa sen listasta.
        t = self.lista[len(self.lista)-1]
        self.lista.pop(len(self.lista)-1)
        print("Pinosta poistetaan " +str(t))
        return t

    def tulosta(self):
        #Tulostetaan
        print(self.lista)
        print("")
#Luodaan Rakenne()-olio ja käytetään sen operaatioita
jono = Jono()

for x in range(5):
    luku = random.randrange(0,100)
    jono.lisaa(luku)
    jono.tulosta()

while (len(jono.lista)) > 1:
    jono.tulosta()
    a = jono.poistaSeuraava()
    print (int(a))

print("jono on tyhjä!")
pino = Pino()
for y in range(5):
    luku = random.randrange(0,100)
    print(luku)
    pino.lisaa(luku)
    pino.tulosta()

while (len(pino.lista)) > 1:
    pino.tulosta()
    a = pino.poistaSeuraava()
    print (int(a))

print("pino on tyhjä!")
