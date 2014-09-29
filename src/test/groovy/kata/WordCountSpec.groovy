package kata

import spock.lang.Specification

class WordCountSpec extends Specification {

    def "should count words"() {
        given:
        def sentence = "aaa bbb ccc aaa ccc ddd ccc eee ddd"
        def wordCounter = new WordCounter(sentence)

        when:
        def count = wordCounter.count()

        then:
        count.size() == 5

        count['aaa'] == 2
        count['bbb'] == 1
        count['ccc'] == 3
        count['ddd'] == 2
        count['eee'] == 1
    }

}
