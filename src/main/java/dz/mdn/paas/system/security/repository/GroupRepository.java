/**
 *	
 *	@author		: CHOUABBIA Amine
 *
 *	@Name		: GroupRepository
 *	@CreatedOn	: 06-26-2025
 *
 *	@Type		: Class
 *	@Layaer		: Model
 *	@Package	: System / Security
 *
 **/

package dz.mdn.paas.system.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.mdn.paas.system.security.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    Optional<Group> findByName(String name);
}