import {HttpClient} from '@angular/common/http';
import {Task} from 'app/tasks/task.model'
import {Injectable} from '@angular/core';
import "rsjs/add/operator/map";

@Injectable()
export class TaskService {

    constructor(private http: HttpClient) {

    }

    getTasks() {
        return this.http.get('/api/tasks').map(response => response.json());
    }

    saveTask(task: Task, checked: boolean) {
        task.completed = checked;
        return this.http.post('/api/tasks/save', task).map(response => response.json());
    }
}
