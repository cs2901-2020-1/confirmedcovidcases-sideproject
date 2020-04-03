package cs_utec.cs2901.repositories;

import cs_utec.cs2901.data.DailyCases;
import org.springframework.data.repository.CrudRepository;

/**
 * Manejo de persistencia de la entity DailyCases - soporte las operaciones basicas CRUD
 * - CREATE INSERT INTO dailyCases VALUES (id_value, cantidad, 'fecha');
 * - READ ONE   SELECT * FROM daylicases WHERE id = 2;
 * - READ ALL   SELECT * FROM daylicases;
 * - UPDATE     UPDATE daylicases SET cantidad = 3 WHERE id=5;
 * - DELETE     DELETE FROM daylicases WHERE id=3;
 * **/

public interface DailyCasesRepository extends CrudRepository<DailyCases, Long> {
}
