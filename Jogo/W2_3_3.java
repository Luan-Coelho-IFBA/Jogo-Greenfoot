import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W2_3_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W2_3_3 extends W2
{
    ContextoW2 contexto;
    
    public W2_3_3(ContextoW2 contexto)
    {
        prepare();
        this.contexto = contexto;
        super.jogador = getObjects(Jogador.class).get(0);
    }
    
    public void act() {
        if (super.jogador != null) {
            super.irParaEsquerda(jogador, contexto.w2_3_2);
            super.irParaCima(jogador, contexto.w2_4_3);
            super.processar();
        }
    }
    
    public void prepare() {
        addObject(new Piso(700, 60), 300, 600); // Chão
        addObject(new Piso(450, 60), 225, 0); // Teto
        addObject(new Piso(60, 700), 600, 300); // Parede direita
        addObject(new Piso(60, 440), 0, 220); // Parede esquerda
        addObject(new Piso(400, 80), 400, 200); // Plataforma #1
        addObject(new Piso(400, 80), 200, 400); // Plataforma #2
        addObject(new Pomba(), 9, 50);
        addObject(new Pomba(), 591, 50);
        addObject(new Pomba(), 300, 50);
        addObject(new Jogador(), 11, 541);
    }
}
