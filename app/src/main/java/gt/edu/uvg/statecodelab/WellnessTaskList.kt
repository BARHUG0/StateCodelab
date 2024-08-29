package gt.edu.uvg.statecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier



@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onClose: (WellnessTask) -> Unit,
    onCheckedTask: (WellnessTask, Boolean) -> Unit
){
    LazyColumn (modifier = modifier) {
        items(items = list,
            key = {task -> task.id}) {
            task -> WellnessTaskItemStateful(taskName = task.label, checked = task.checked, onCheckedChange = { checked -> onCheckedTask(task, checked)}, onClose = { onClose(task) })
        }
    }
}

