package viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import db.NotasRepository
import db.notaDB
import entities.Notaent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NotaViewModel (application: Application): AndroidViewModel(application) {

    private val repository: NotasRepository

    val allNotas: LiveData<List<Notaent>>

    init {

        val Notadao = notaDB.getDatabase(application, viewModelScope).Notadao()
        repository = NotasRepository(Notadao)
        allNotas = repository.allNotas
    }

    fun insert(notaent: Notaent)= viewModelScope.launch(Dispatchers.IO){
        repository.insert(notaent)
    }


    fun delete (id: Int)= viewModelScope.launch(Dispatchers.IO){
        repository.delete(id)
    }


    fun update (id: Int, titulo: String, texto: String, data: String)= viewModelScope.launch(
        Dispatchers.IO){
        repository.update(id, titulo, texto, data)
    }


}