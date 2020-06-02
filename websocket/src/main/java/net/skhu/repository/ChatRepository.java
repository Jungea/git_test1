package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.Chat;

public interface ChatRepository extends JpaRepository<Chat, Integer>{

}
