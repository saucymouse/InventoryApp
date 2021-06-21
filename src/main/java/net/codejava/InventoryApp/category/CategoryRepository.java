package net.codejava.InventoryApp.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
