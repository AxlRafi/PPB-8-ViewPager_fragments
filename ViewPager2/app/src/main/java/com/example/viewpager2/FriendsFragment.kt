package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FriendsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var friendAdapter: MyFriendAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_friends, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        setupRecyclerView()
        return view
    }

    private fun setupRecyclerView() {
        // List of friends with image resources
        val friends = listOf(
            MyFriend("Alice", "123-456-7890", "alice@example.com", R.drawable.alice_profile),
            MyFriend("Bob", "987-654-3210", "bob@example.com", R.drawable.bob_profile),
            MyFriend("Charlie", "555-555-5555", "charlie@example.com", R.drawable.charlie_profile),
            MyFriend("Alice", "123-456-7890", "alice@example.com", R.drawable.alice_profile),
            MyFriend("Bob", "987-654-3210", "bob@example.com", R.drawable.bob_profile),
            MyFriend("Charlie", "555-555-5555", "charlie@example.com", R.drawable.charlie_profile),
            MyFriend("Alice", "123-456-7890", "alice@example.com", R.drawable.alice_profile),
            MyFriend("Bob", "987-654-3210", "bob@example.com", R.drawable.bob_profile),
            MyFriend("Charlie", "555-555-5555", "charlie@example.com", R.drawable.charlie_profile),
            MyFriend("Alice", "123-456-7890", "alice@example.com", R.drawable.alice_profile),
            MyFriend("Bob", "987-654-3210", "bob@example.com", R.drawable.bob_profile),
            MyFriend("Charlie", "555-555-5555", "charlie@example.com", R.drawable.charlie_profile)
        )

        // Initialize the adapter and assign it to the RecyclerView
        friendAdapter = MyFriendAdapter(friends)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = friendAdapter
    }
}
