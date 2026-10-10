
package com.vcube.ITAsset.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vcube.ITAsset.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
