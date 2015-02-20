/*
 * Binary.java
 *
 * Copyright (C) 2006 - 2008 Erdem Güven <zuencap@users.sourceforge.net>.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package seksen.util.disasm;

/**
 *
 * @author Erdem Guven
 */
public interface Binary {

    int getOffset();

    int getAddress();

    void setAddress(int address);

    void seek(int offset);

    byte nextByte();

    short nextWord();

}
