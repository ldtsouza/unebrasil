package br.ucsal.pdm.unebrasil.repository;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import br.ucsal.pdm.unebrasil.model.Doacao;

@Dao
public interface DoacaoDAO {


    @Insert
    void insere(Doacao... doacao);

    @Query("SELECT * FROM doacao")
    LiveData<List<Doacao>> obterLista();

    @Update
    void atualize(Doacao... doacao);

    @Delete
    void excluir(Doacao... doacao);





}
