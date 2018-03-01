	/*elem
		del elem
		search elem in list (elem)
		first occurence
		last occurence
		tri elem
	main add elem list
	*/
	class Project {
		public static void main() {
			return;
		}
	}

	public class ListLinked {
		private Elem head;
		private int countElem;

		public ListLinked(Object e)
		{
			head = new Elem(e);
		}

		class Elem {
			private Object info;
			private Elem next;

			public Elem(Object myInfo)
			{
				info = myInfo;
			}

			public Object getInfo() {
				return info;
			}
		}

		// COUNT
		public int getCountElem()
		{
			return countElem;
		}

		// ADD
		public void addElemAtHead(Elem e)
		{
			Elem tmp = head;
			head = new Elem(e);
			head.next = tmp;
			countElem++;
		}

		public void addElemAtEnd(Elem e)
		{
			Elem tmp = head;
			while(tmp.next != null)
			{
				tmp = tmp.next;
			}
			tmp.next = new Elem(e);
			countElem++;
		}

		public void addElemAtPos(Elem e, int pos)
		{
		    Elem tmp = head;
			Elem find;
			int i = 0;
			while(i < pos  - 1 && tmp.next != null)
				{
					tmp = tmp.next;
					i++;
				}
			find = tmp.next;
			tmp.next = new Elem(e);
			tmp.next.next = find;
			countElem++;
		}

		// DEL
		public void delElemAtPos(int pos)
		{
			Elem tmp = head;
			int i = 0;
			while (i < pos - 1 && tmp.next != null)
				{
					tmp = tmp.next;
					i++;
				}
			tmp.next = tmp.next.next;
			countElem--;
		}

		public void delElem(Elem to_delete) {
			Elem tmp = head;
			while (tmp != to_delete && tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = tmp.next.next;
			countElem--;
		}

		// GET
        public Elem getElem(Elem to_find) {
            Elem e = head;
            int i = 0;
            while (e != to_find) {
                i++;
                e = e.next;
            }
            return (e);
        }

		public Elem getElemByPos(int pos)
		{
            Elem e = head;
            int i = 0;
            while (i < pos)
            {
                e = e.next;
                i++;
            }
            return (e);
		}
	}
