package com.messages.service;

import com.messages.entity.Friend;

public interface FriendService {
    Friend checkFriends(Integer friend_send, Integer friend_reply);
}