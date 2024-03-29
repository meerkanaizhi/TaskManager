package kg.geektech.taskmanager.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.taskmanager.databinding.FragmentTaskBinding
import kg.geektech.taskmanager.databinding.ItemTaskBinding
import kg.geektech.taskmanager.model.Task

class TaskAdapter (private val data: ArrayList<Task>): RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    inner class TaskViewHolder (private val binding: ItemTaskBinding): RecyclerView.ViewHolder(binding.root){
    fun bind (task: Task){
        binding.tvTitle.text=task.title
        binding.tvDesc.text = task.desc
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
      return TaskViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(data.get(position))
    }

    override fun getItemCount(): Int {
        return data.size
    }
}