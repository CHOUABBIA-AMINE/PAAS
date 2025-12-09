/**
 *	
 *	@author		: CHOUABBIA Amine
 *
 *	@Name		: AuthorityRepository
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

import dz.mdn.paas.system.security.model.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(String name);
}