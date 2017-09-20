package com.lol.empty;

import java.util.List;

public class UserExtInfoData {
    private int result;
    private int item_num;
    private List<UserExtInfoDataItems> items;
    private int triple_kills;
    private int quadra_kills;
    private int penta_kills;
    private int god_like_num;
    private int kills_total;
    private int assists_total;
    private int ward_placed_total;
    private int total_match_mvps;
    private int total_rank_mvps;
    private int top_num;
    private List<String> top_champions;
    private int total_match_loss_mvps;
    private int total_rank_loss_mvps;
    private int champion_num;
    private List<UserExtInfoDataChampionList> champion_list;

	public UserExtInfoData(int result, int item_num, List<UserExtInfoDataItems> items, int triple_kills,
			int quadra_kills, int penta_kills, int god_like_num, int kills_total, int assists_total,
			int ward_placed_total, int total_match_mvps, int total_rank_mvps, int top_num, List<String> top_champions,
			int total_match_loss_mvps, int total_rank_loss_mvps, int champion_num,
			List<UserExtInfoDataChampionList> champion_list) {
		super();
		this.result = result;
		this.item_num = item_num;
		this.items = items;
		this.triple_kills = triple_kills;
		this.quadra_kills = quadra_kills;
		this.penta_kills = penta_kills;
		this.god_like_num = god_like_num;
		this.kills_total = kills_total;
		this.assists_total = assists_total;
		this.ward_placed_total = ward_placed_total;
		this.total_match_mvps = total_match_mvps;
		this.total_rank_mvps = total_rank_mvps;
		this.top_num = top_num;
		this.top_champions = top_champions;
		this.total_match_loss_mvps = total_match_loss_mvps;
		this.total_rank_loss_mvps = total_rank_loss_mvps;
		this.champion_num = champion_num;
		this.champion_list = champion_list;
	}

	@Override
	public String toString() {
		return "UserExtInfoData [result=" + result + ", item_num=" + item_num + ", items=" + items + ", triple_kills="
				+ triple_kills + ", quadra_kills=" + quadra_kills + ", penta_kills=" + penta_kills + ", god_like_num="
				+ god_like_num + ", kills_total=" + kills_total + ", assists_total=" + assists_total
				+ ", ward_placed_total=" + ward_placed_total + ", total_match_mvps=" + total_match_mvps
				+ ", total_rank_mvps=" + total_rank_mvps + ", top_num=" + top_num + ", top_champions=" + top_champions
				+ ", total_match_loss_mvps=" + total_match_loss_mvps + ", total_rank_loss_mvps=" + total_rank_loss_mvps
				+ ", champion_num=" + champion_num + ", champion_list=" + champion_list + "]";
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getItem_num() {
		return item_num;
	}

	public void setItem_num(int item_num) {
		this.item_num = item_num;
	}

	public List<UserExtInfoDataItems> getItems() {
		return items;
	}

	public void setItems(List<UserExtInfoDataItems> items) {
		this.items = items;
	}

	public int getTriple_kills() {
		return triple_kills;
	}

	public void setTriple_kills(int triple_kills) {
		this.triple_kills = triple_kills;
	}

	public int getQuadra_kills() {
		return quadra_kills;
	}

	public void setQuadra_kills(int quadra_kills) {
		this.quadra_kills = quadra_kills;
	}

	public int getPenta_kills() {
		return penta_kills;
	}

	public void setPenta_kills(int penta_kills) {
		this.penta_kills = penta_kills;
	}

	public int getGod_like_num() {
		return god_like_num;
	}

	public void setGod_like_num(int god_like_num) {
		this.god_like_num = god_like_num;
	}

	public int getKills_total() {
		return kills_total;
	}

	public void setKills_total(int kills_total) {
		this.kills_total = kills_total;
	}

	public int getAssists_total() {
		return assists_total;
	}

	public void setAssists_total(int assists_total) {
		this.assists_total = assists_total;
	}

	public int getWard_placed_total() {
		return ward_placed_total;
	}

	public void setWard_placed_total(int ward_placed_total) {
		this.ward_placed_total = ward_placed_total;
	}

	public int getTotal_match_mvps() {
		return total_match_mvps;
	}

	public void setTotal_match_mvps(int total_match_mvps) {
		this.total_match_mvps = total_match_mvps;
	}

	public int getTotal_rank_mvps() {
		return total_rank_mvps;
	}

	public void setTotal_rank_mvps(int total_rank_mvps) {
		this.total_rank_mvps = total_rank_mvps;
	}

	public int getTop_num() {
		return top_num;
	}

	public void setTop_num(int top_num) {
		this.top_num = top_num;
	}

	public List<String> getTop_champions() {
		return top_champions;
	}

	public void setTop_champions(List<String> top_champions) {
		this.top_champions = top_champions;
	}

	public int getTotal_match_loss_mvps() {
		return total_match_loss_mvps;
	}

	public void setTotal_match_loss_mvps(int total_match_loss_mvps) {
		this.total_match_loss_mvps = total_match_loss_mvps;
	}

	public int getTotal_rank_loss_mvps() {
		return total_rank_loss_mvps;
	}

	public void setTotal_rank_loss_mvps(int total_rank_loss_mvps) {
		this.total_rank_loss_mvps = total_rank_loss_mvps;
	}

	public int getChampion_num() {
		return champion_num;
	}

	public void setChampion_num(int champion_num) {
		this.champion_num = champion_num;
	}

	public List<UserExtInfoDataChampionList> getChampion_list() {
		return champion_list;
	}

	public void setChampion_list(List<UserExtInfoDataChampionList> champion_list) {
		this.champion_list = champion_list;
	}

	public UserExtInfoData() {
		// TODO Auto-generated constructor stub
	}
}
