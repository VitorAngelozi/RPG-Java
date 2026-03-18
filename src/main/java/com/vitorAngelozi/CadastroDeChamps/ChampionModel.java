package com.vitorAngelozi.CadastroDeChamps;

import jakarta.persistence.*;

@Entity
@Table(name= "tb_cadastro_de_champion")
public class ChampionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int hp;

    private int ad;

    private int ap;

    public ChampionModel() {
    }

    public ChampionModel(String nome, int ap, int ad, int hp) {
        this.nome = nome;
        this.ap = ap;
        this.ad = ad;
        this.hp = hp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }
}
