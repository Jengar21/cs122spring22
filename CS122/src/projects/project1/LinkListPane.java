package projects.project1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LinkListPane extends Application {
	
	private LinkedList<String> list = new LinkedList<>();
	
	public void start(Stage primaryStage) {
	

		
		TextField textField = new TextField();
		Button add = new Button("ADD");
		Button remove = new Button("REMOVE");
		Button clear = new Button("CLEAR");
		
		add.setOnAction(e -> {
			String value = textField.getText();
			list.add(value);
			textField.clear();
		});
		remove.setOnAction(e -> {
			list.remove();
		});
		clear.setOnAction(e -> {
			list.clear();
		});
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(textField, add, remove, clear);
		VBox vBox = new VBox(10);
		vBox.getChildren().addAll(list, hBox);
		Scene scene = new Scene(vBox, 400, 250);
		hBox.setStyle("-fx-background-color: orange");
		vBox.setStyle("-fx-background-color: orange");
		
		primaryStage.setTitle("Link List");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
class LinkedList<T> extends VBox {
	private Node<T> head;
	private Node<T> tail;
	public LinkedList() {
		super(10);
		this.head = null;
		this.tail = null;
	}
	public void add(T value) {
		Node<T> node = new Node<>(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		this.getChildren().add(node);
	}
	public void remove() {
		
		this.getChildren().remove(head);
		head = head.getNext();
		if (head == null) {
			tail = null;
		}
	}
	public void clear() {
		this.getChildren().clear();
		head = null;
		tail = null;
	}
	
	public String toString() {
		if (head == null) {
			return "null";
		}
		return head.toString();
	}
}
class Node<T> extends HBox {
	private T value;
	private Node<T> next;
	public Node(T value) {
		super(10);
		this.value = value;
		this.next = null;
		this.getChildren().add(new Button(value.toString()));
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}

	public String toString() {
		if (next == null) {
			return value + " -> null";
		}
		return value + " -> " + next.toString();
	}
}