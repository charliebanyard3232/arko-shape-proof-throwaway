// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class OrderGen1281Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 9762 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 385 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 1417 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 7513 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 3790 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 9647 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 3468 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 7131 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 9040 }
    /** Derived accessor for description (generated filler). */
    def computeDescription9() { return 3861 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 3430 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes11() { return 4598 }
}
